package com.ercan.main;

import com.ercan.model.Hesap;
import com.ercan.model.Kisi;
import com.ercan.service.IslemServiceImpl;
import com.ercan.service.KisiService;
import com.ercan.service.KisiServiceImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AtmApp {
    static Scanner scanner = new Scanner(System.in);
    static Kisi kisi = new Kisi();
    static KisiService kisiService = new KisiServiceImpl();
    static IslemServiceImpl islemService = new IslemServiceImpl(kisiService);

    public static void login() {
        int error_count = 0;
        System.out.println("Giriş");
        System.out.print("kullanıcı adi:");
        String username = scanner.next();
        System.out.print("şifre:");
        String password = scanner.next();
        for (Kisi the_kisi : kisiList()) {
            if (the_kisi.getUsername().equals(username) && the_kisi.getPassword().equals(password)) {
                kisi = the_kisi;
                secim();
            } else {
                error_count++;
            }
        }
        if (error_count == kisiList().size()) {
            System.out.println("Yanlış giriş...");
            login();
        }

    }

    public static int menu() {
        System.out.println("---------- M E N U ----------");
        System.out.println("1-Para yatırma");
        System.out.println("2-Para çek");
        System.out.println("3-Bakiye sorgula");
        System.out.println("4-Kişileri listele");
        System.out.println("5-Çıkış yap");
        System.out.print("Yapılacak işlemi seçin:");
        int secim = scanner.nextInt();
        return secim;
    }

    public static void secim() {

        int sec = menu();

        switch (sec) {

            case 1:
                System.out.print("Yatırılacak tutarı girin:");
                double girilen_tutar = scanner.nextDouble();
                islemService.paraYatir(girilen_tutar, kisi.getId());
                secim();
                break;
            case 2:
                System.out.print("Çekilecek tutarı girin:");
                double cekilen_tutar = scanner.nextDouble();
                islemService.paraCek(cekilen_tutar, kisi.getId());
                secim();
                break;
            case 3:
                System.out.println("Bakiyeniz:" + kisi.getHesap().getHesap_bakiye());
                secim();
                break;
            case 4:
                System.out.println("Kisiler:");
                Iterator<Kisi> iterator = kisiList().iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                secim();
                break;

            case 5:
                System.out.println("Çıkış yaptınız...");
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız");
                break;
        }
    }

    public static List<Kisi> kisiList() {
        return kisiService.kisiList();
    }

    public static void main(String[] args) {

        login();
    }
}

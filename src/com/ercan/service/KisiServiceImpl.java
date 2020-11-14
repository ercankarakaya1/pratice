package com.ercan.service;

import com.ercan.model.Hesap;
import com.ercan.model.Kisi;

import java.util.ArrayList;
import java.util.List;

public class KisiServiceImpl implements KisiService {

    Kisi kisi = new Kisi();
    private List<Kisi> kisiList = new ArrayList<>();
    private List<Hesap> hesapList = new ArrayList<>();

    public KisiServiceImpl() {
        Hesap hesap1 = new Hesap(1L, "12345", 1000);
        this.hesapList.add(hesap1);
        this.kisiList.add(new Kisi(1L, "Mert", "Kiraz", "mert", "123", hesap1));

        Hesap hesap2 = new Hesap(2L, "3210", 22222);
        this.hesapList.add(hesap2);
        this.kisiList.add(new Kisi(2L, "Ercan", "Karakaya", "ercan", "123", hesap2));

        Hesap hesap3 = new Hesap(3L, "9876", 90000);
        this.hesapList.add(hesap3);
        this.kisiList.add(new Kisi(3L, "Ayşe", "Kurt", "ayse", "123", hesap3));
        System.out.println("Kişiler oluşturuldu...");
        System.out.println("Hesaplar oluşturuldu...");
    }

    @Override
    public Kisi getKisi(Long id) {
        for (Kisi k : this.kisiList) {
            if (id == k.getId()) {
                kisi = k;
            }
        }
        return kisi;
    }

    @Override
    public List<Kisi> kisiList() {
        List<Kisi> kisiler = kisiList;
        return kisiler;
    }
}

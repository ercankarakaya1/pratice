package com.ercan.service;


import com.ercan.model.Kisi;

public class IslemServiceImpl implements IslemService {

    KisiService kisiService = new KisiServiceImpl();

    public IslemServiceImpl(KisiService kisiService) {
        this.kisiService = kisiService;
    }

    public IslemServiceImpl() {
    }

    @Override
    public void paraYatir(double girilen_tutar, Long id) {
        Kisi kisi=kisiService.getKisi(id);
        if (kisi!= null) {
            kisi.getHesap().bakiyeHesapla(girilen_tutar);
            System.out.println("Para yatırıldı...Mevcut tutar=" + kisi.getHesap().getHesap_bakiye());
        }

    }

    @Override
    public void paraCek(double cekilen_tutar, Long id) {
        Kisi kisi=kisiService.getKisi(id);
          if (kisi!=null){
              if (kisi.getHesap().getHesap_bakiye()<cekilen_tutar){
                  System.out.println("Yetersiz bakiye...");
              }else {
                  kisi.getHesap().setHesap_bakiye(kisi.getHesap().getHesap_bakiye()-cekilen_tutar);
                  System.out.println("Para çekildi...Mevcut tutar=" + kisi.getHesap().getHesap_bakiye());
              }
          }
    }
}

package com.ercan.model;

import java.util.ArrayList;
import java.util.List;

public class Kisi {

    private Long id;
    private String ad;
    private String soyad;
    private String username;
    private String password;
    private Hesap hesap;


    public Kisi() {

    }

    public Kisi(Long id, String ad, String soyad, String username, String password, Hesap hesap) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.username = username;
        this.password = password;
        this.hesap = hesap;
    }

    public Kisi(String ad, String soyad, Hesap hesap) {
        this.ad = ad;
        this.soyad = soyad;
        this.hesap = hesap;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Hesap getHesap() {
        return hesap;
    }

    public void setHesap(Hesap hesap) {
        this.hesap = hesap;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", hesap=" + hesap +
                '}';
    }
}

package com.ercan.model;

import java.util.ArrayList;
import java.util.List;

public class Hesap {

    private Long id;
    private String hesapNo;
    private double hesap_bakiye;
    private List<Hesap> hesapList = new ArrayList<>();

    public Hesap(Long id, String hesapNo, double hesap_bakiye) {
        this.id = id;
        this.hesapNo = hesapNo;
        this.hesap_bakiye = hesap_bakiye;
    }

    public Hesap() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getHesap_bakiye() {
        return hesap_bakiye;
    }

    public void setHesap_bakiye(double hesap_bakiye) {
        this.hesap_bakiye = hesap_bakiye;
    }
    public void bakiyeHesapla(double tutar){
        this.hesap_bakiye+=tutar;
    }

    public List<Hesap> getHesapList() {
        return hesapList;
    }

    public void setHesapList(List<Hesap> hesapList) {
        this.hesapList = hesapList;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "id=" + id +
                ", hesapNo='" + hesapNo + '\'' +
                ", hesap_bakiye=" + hesap_bakiye +
                '}';
    }
}

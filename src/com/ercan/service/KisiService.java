package com.ercan.service;

import com.ercan.model.Kisi;

import java.util.List;

public interface KisiService {

    public Kisi getKisi(Long id);
    public List<Kisi> kisiList();

}

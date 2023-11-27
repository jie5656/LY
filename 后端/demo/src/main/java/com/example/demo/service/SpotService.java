package com.example.demo.service;

import com.example.demo.domain.Spot;

import java.util.List;

public interface SpotService {
    //    Page<Spot> getAllSpots(int pageNum, int pageSize);
    List<Spot> getAllSpots();

    Spot getSpotById(Long id);

    //    public Page<Spot> getAllSpots(int pageNum, int pageSize) {
//        PageRequest pageRequest = PageRequest.of(pageNum - 1, pageSize);
//        return spotDao.findAll(pageRequest);
//    }
}
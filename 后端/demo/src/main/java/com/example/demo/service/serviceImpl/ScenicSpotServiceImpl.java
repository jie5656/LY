package com.example.demo.service.serviceImpl;

import com.example.demo.domain.ScenicSpot;
import com.example.demo.repository.ScenicSpotDao;
import com.example.demo.service.ScenicSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScenicSpotServiceImpl implements ScenicSpotService {
    private final ScenicSpotDao scenicSpotDao;

    @Autowired
    public ScenicSpotServiceImpl(ScenicSpotDao scenicSpotRepository) {
        this.scenicSpotDao = scenicSpotRepository;
    }

    @Override
    public List<String> getTopRankedSpots(int limit) {
        List<ScenicSpot> rankedSpots = scenicSpotDao.findAll();
        rankedSpots.sort((spot1, spot2) -> spot2.getWant() - spot1.getWant());
        return rankedSpots.stream()
                .limit(limit)
                .map(ScenicSpot::getName)
                .collect(Collectors.toList());
    }
}

package com.example.demo.controller;

import com.example.demo.service.ScenicSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/spot")
public class ScenicSpotController {
    private final ScenicSpotService scenicSpotService;

    @Autowired
    public ScenicSpotController(ScenicSpotService scenicSpotService) {
        this.scenicSpotService = scenicSpotService;
    }

    @GetMapping("/ranking")
    public List<String> getTopRankedSpots() {
        int limit = 10; // 获取前10个排名
        List<String> topRankedSpots = scenicSpotService.getTopRankedSpots(limit);

//        System.out.println("前10的景点是: " + topRankedSpots);

        return topRankedSpots;
    }
}

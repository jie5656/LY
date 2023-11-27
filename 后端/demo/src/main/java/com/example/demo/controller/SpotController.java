package com.example.demo.controller;

import com.example.demo.domain.Spot;
import com.example.demo.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/spot")
public class SpotController {
    private final SpotService spotService;

    @Autowired
    public SpotController(SpotService spotService) {
        this.spotService = spotService;
    }

    @GetMapping("/show")
    public List<Spot> getSpots() {
        return spotService.getAllSpots();
    }

    //    public Page<Spot> getSpots(@RequestParam(defaultValue = "1") int pageNum,
//                               @RequestParam(defaultValue = "5") int pageSize) {
//        Page<Spot> spots = spotService.getAllSpots(pageNum, pageSize);
//        System.out.println("aaaa" + spots);
//        return spots;
//    }
    @GetMapping("/show/{id}")
    public Spot getSpot(@PathVariable Long id) {
        return spotService.getSpotById(id);
    }
}

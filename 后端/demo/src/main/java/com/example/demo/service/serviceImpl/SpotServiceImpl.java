package com.example.demo.service.serviceImpl;

import com.example.demo.domain.Spot;
import com.example.demo.repository.SpotDao;
import com.example.demo.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpotServiceImpl implements SpotService {
    private final SpotDao spotDao;

    @Autowired
    public SpotServiceImpl(SpotDao spotDao) {
        this.spotDao = spotDao;
    }

    @Override
    public List<Spot> getAllSpots() {
        return spotDao.findAll();
    }

    @Override
    public Spot getSpotById(Long id) {
        return spotDao.findById(id)
                .orElseThrow(() -> new RuntimeException("找不到id: " + id));
    }

    //    public Page<Spot> getAllSpots(int pageNum, int pageSize) {
//        PageRequest pageRequest = PageRequest.of(pageNum - 1, pageSize);
//        return spotDao.findAll(pageRequest);
//    }
}

package com.javawebapplication.cowcalftracker.service;

import com.javawebapplication.cowcalftracker.model.Cattle;
import com.javawebapplication.cowcalftracker.repository.CattleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CattleServiceImpl implements CattleService{

    private CattleRepository cattleRepository;


    @Override
    public List<Cattle> getAllCattle() {
        return cattleRepository.findAll();
    }
}

//4
//This as the implementation of the CattleService.java interface.
//@Autowired is used to inject the CattleRepository class into this file to get all the contents of the table.
package com.javawebapplication.cowcalftracker.service;

import com.javawebapplication.cowcalftracker.model.Cattle;
import com.javawebapplication.cowcalftracker.repository.CattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CattleServiceImpl implements CattleService{

    @Autowired
    private CattleRepository cattleRepository;

    @Override
    public List<Cattle> getAllCattle() {
        return cattleRepository.findAll();
    }
}
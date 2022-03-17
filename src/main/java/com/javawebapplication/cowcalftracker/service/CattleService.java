//3
//This interface creates a list of the Cattle.java class object and names it getAllCattle()
package com.javawebapplication.cowcalftracker.service;

import com.javawebapplication.cowcalftracker.model.Cattle;

import java.util.List;

public interface CattleService {
    List<Cattle> getAllCattle();
}

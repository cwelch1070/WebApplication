package com.javawebapplication.cowcalftracker.repository;

import com.javawebapplication.cowcalftracker.model.Cattle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CattleRepository extends JpaRepository<Cattle, Long> {
}

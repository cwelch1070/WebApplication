//2
//This class function as the repository and allows the application to perform CRUD operations.
//In this case for the Spring project it uses JpaRepository aka Java Persistence API.
//The JpaRepository implements the Cattle class.
package com.javawebapplication.cowcalftracker.repository;

import com.javawebapplication.cowcalftracker.model.Cattle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CattleRepository extends JpaRepository<Cattle, Long> {
}

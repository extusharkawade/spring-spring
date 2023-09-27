package com.example.building.repository;

import com.example.building.model.Chairs;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ChairsRepo extends JpaRepository<Chairs,Integer> {
}

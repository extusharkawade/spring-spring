package com.example.building.service;

import com.example.building.model.Chairs;
import com.example.building.repository.ChairsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class HomeService {

    @Autowired
    ChairsRepo chairsRepo;

    public  String getMaintenanceWarning(){
      Optional<Chairs> chairs =  chairsRepo.findById(2);
      if(!chairs.isEmpty()) {
          return "This site is under maintenance chair id is" + chairs.get().getId();
      }
      else {
          return "This site is under maintenance";
      }
    }
}

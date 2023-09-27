package com.example.building.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Chairs")
public class Chairs {
    @Id
    private int id;
    private String name;
}

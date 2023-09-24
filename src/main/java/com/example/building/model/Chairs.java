package com.example.building.model;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Chairs {
    private int id;
    private String name;
}

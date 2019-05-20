package com.codeclan.example.pirateservice.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ships")
public class Ship {
    private String name;
    private ArrayList<Pirate> pirates;

    public Ship(String name, List<Pirate> pirates) {
        this.name = name;
        this.pirates = ArrayList<Pirate>();
    }
}

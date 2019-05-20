package com.codeclan.example.pirateservice.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="ships")
public class Ship {
    private String name;
    private List<Pirate> pirates;
}

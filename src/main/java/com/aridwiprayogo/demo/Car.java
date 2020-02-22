package com.aridwiprayogo.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private String color;
    private String fuel;
    private int year;

    public Car() {
    }

    public Car(String brand, String model, String color, String fuel, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    public int getYear() {
        return year;
    }
}

package com.vehicle.rental;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;


@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String brand;

    private String type;

    @Column(name = "price_per_day")
    private double pricePerDay;

    // Constructors
    public Vehicle() {}

    public Vehicle(String model, String brand, String type, double pricePerDay) {
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.pricePerDay = pricePerDay;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(double pricePerDay) { this.pricePerDay = pricePerDay; }
}

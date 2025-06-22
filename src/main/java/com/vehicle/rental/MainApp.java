package com.vehicle.rental;

public class MainApp {
    public static void main(String[] args) {
        VehicleDAO vehicleDAO = new VehicleDAO();

        // Create and save a vehicle
        Vehicle car = new Vehicle();
        car.setModel("Model S");
        car.setBrand("Tesla");
        car.setType("Electric");
        car.setPricePerDay(150.0);

        vehicleDAO.saveVehicle(car);

        // Fetch the vehicle
        Vehicle fetched = vehicleDAO.getVehicle(car.getId());
        if (fetched != null) {
            System.out.println("Fetched Vehicle: " + fetched.getModel() + ", " + fetched.getBrand());
        }
    }
}

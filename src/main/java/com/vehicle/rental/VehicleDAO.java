package com.vehicle.rental;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicleDAO {

    // Save a vehicle to the DB
    public void saveVehicle(Vehicle vehicle) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(vehicle);
            transaction.commit();
            System.out.println("Vehicle saved successfully!");
        } catch (Exception e) {
            if (transaction != null &&  transaction.getStatus().canRollback()) {
            e.printStackTrace();
            }
        }
    }

    // Fetch vehicle by ID
    public Vehicle getVehicle(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Vehicle.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.company;

public class Order {
    private Taxi taxi;
    private Driver driver;

    public Order(Taxi taxi, Driver driver) {
        this.taxi = taxi;
        this.driver = driver;
    }

    public void confirmOrder() {
        boolean isConfirmedByDriver = driver.requestRoad(this);
        boolean isConfirmedByTaxi = taxi.requestCar(driver, this);
        if (isConfirmedByDriver && isConfirmedByTaxi) {
            System.out.println("Order is created.");
        }
    }

    public void discardOrder() {
        driver.discardRoad();
        taxi.discardCar();
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public Driver getDriver() {
        return driver;
    }
}
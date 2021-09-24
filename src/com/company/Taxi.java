package com.company;

public class Taxi {
    private Driver driver;
    private Boolean available = true;
    private Order currentOrder;

    public Taxi(){}

    public boolean requestCar(Driver driver, Order order) {
        if (this.available) {
            this.available = false;
            this.driver = driver;
            this.currentOrder = order;
            return true;
        }
        System.out.println("This Taxi is taken");
        return false;
    }

    public void discardCar() {
        this.available = true;
        this.driver = null;
        this.currentOrder = null;
    }

    public Driver getDriver() {
        return driver;
    }

    public Boolean getAvailable() {
        return available;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "current driver=" + driver +
                ", available=" + available +
                ", currentOrder=" + currentOrder +
                '}';
    }
}

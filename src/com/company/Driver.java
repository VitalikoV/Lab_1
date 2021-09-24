package com.company;

public class Driver {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private boolean available = true;
    private Order currentOrder;

    public Driver(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public boolean requestRoad(Order order) {
        if (available) {
            available = false;
            currentOrder = order;
            return true;
        }
        System.out.println("Sorry, still in road");
        return false;
    }

    public void discardRoad() {
        available = true;
        currentOrder = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAvailable() {
        return available;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", available=" + available +
                ", currentOrder=" + currentOrder +
                '}';
    }
}

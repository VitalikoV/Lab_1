package com.company.Tasks;

import com.company.Driver;
import com.company.Order;
import com.company.Task;
import com.company.Taxi;

public class Task11 implements Task {

    @Override
    public void executeTask() throws Exception {
        Driver driver = new Driver("Test", "Test", 20, "test@test.com");
        Taxi taxi = new Taxi();
        Order order = new Order(taxi, driver);
        order.confirmOrder();
        Driver driver2 = new Driver("Test2", "Test2", 20, "test@test.com");
        Order order2 = new Order(taxi, driver2);
        order2.confirmOrder();
        System.out.println(order);
        System.out.println(taxi);
    }
}

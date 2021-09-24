package com.company.Tasks;

import com.company.CustomDouble;
import com.company.Task;

public class Task8 implements Task {

    @Override
    public void executeTask() throws Exception {
        CustomDouble cd = new CustomDouble(10, 0);
        CustomDouble cd2 = new CustomDouble(5, 0);

        CustomDouble cd3 = cd.sum(cd2);

        CustomDouble cd4 = CustomCalculator.divide(cd, cd2);
        System.out.println("custom double integral: " + cd4.getNumber());
        System.out.println("custom double fraction: " + cd4.getFraction());
        System.out.println("custom double: " + cd4.toDouble());
    }
}

package com.company.Tasks;

import com.company.CustomDouble;

public class CustomCalculator {
    public static CustomDouble sum(CustomDouble cs1, CustomDouble cs2) {
        int fractionPart = ((cs1.getFraction() + cs2.getFraction())/100);
        int integralPart = cs1.getNumber() + cs2.getNumber() + fractionPart;
        return new CustomDouble(integralPart, (cs1.getFraction() + cs2.getFraction()) - fractionPart*100);
    }

    public static CustomDouble subtract(CustomDouble cs1, CustomDouble cs2) {
        return new CustomDouble((int)(cs1.toDouble() - cs2.toDouble()),  (int)((cs1.toDouble() - cs2.toDouble()) - (int)(cs1.toDouble() - cs2.toDouble()))*100);
    }

    public static CustomDouble multiply(CustomDouble cs1, CustomDouble cs2) {
        double multipliedVal = cs1.toDouble() * cs2.toDouble();
        return new CustomDouble((int)(multipliedVal),  (int)(((multipliedVal) - (int)multipliedVal)*100));
    }

    public static CustomDouble divide(CustomDouble cs1, CustomDouble cs2) {
        double dividedVal = cs1.toDouble() / cs2.toDouble();
        return new CustomDouble((int)(dividedVal),  (int)(((dividedVal) - (int)dividedVal)*100));
    }

}

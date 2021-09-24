package com.company;

import java.util.Objects;

public class CustomDouble {
    private int number;
    private int fraction;

    public CustomDouble(int number, int fraction){
            this.number = number;
            this.fraction = fraction;
    }

    public CustomDouble sum(CustomDouble summarizedCd){
        int fractionPart = ((fraction + summarizedCd.getFraction())/100);
        int integralPart = number + summarizedCd.getNumber() + fractionPart;
        return new CustomDouble(integralPart, (fraction + summarizedCd.getFraction()) - fractionPart*100);
    }

    public CustomDouble subtract(CustomDouble summarizedCd)  {
        return new CustomDouble((int)(toDouble() - summarizedCd.toDouble()),  (int)((toDouble() - summarizedCd.toDouble()) - (int)(toDouble() - summarizedCd.toDouble()))*100);
    }

    public Double toDouble(){
        return ((double) number + (double) fraction / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDouble that = (CustomDouble) o;
        boolean isEqual = that.toDouble().equals(toDouble());
        return isEqual && number == that.number && fraction == that.fraction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, fraction);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }
}

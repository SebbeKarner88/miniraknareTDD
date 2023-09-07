package org.example;

public class Miniraknare {


    public long addition(long term1, long term2) {
        long sum = term1+term2;
        long max = 2147483647;
        long min = -2147483647;
        if(sum > max || sum < min)
            throw new ArithmeticException("Value out of bounds!");
        return sum;
    }

    public long subtraction(long term1, long term2) {
        long sum = term1-term2;
        long max = 2147483647;
        long min = -2147483647;
        if(sum > max || sum < min)
            throw new ArithmeticException("Value too low!");
        return sum;
    }

    public int multiplication(int factor1, int factor2) {
        return factor1*factor2;
    }

    public long division(int numerator, int denominator) {
        if(denominator == 0)
            throw new ArithmeticException("Can not divide by zero.");
        return numerator/denominator;
    }

    public int squared(int base) {
        return base*base;
    }

    public double root(long term) {
        if (term <= 0)
            throw new ArithmeticException("Not  allowed");
        return Math.sqrt(term);
    }

    public String radix10(int number, int radix){

        Resources resources = new Resources();
        return resources.presentValue(number, radix);
    }
}

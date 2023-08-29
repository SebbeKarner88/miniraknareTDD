package org.example;

public class Miniraknare {


    public static long addition(long term1, long term2) {
        long sum = term1+term2;
        long max = 2147483647;
        long min = -2147483647;
        if(sum > max || sum < min)
            throw new ArithmeticException("Value out of bounds!");
        return sum;
    }

    public static long subtraction(long term1, long term2) {
        long sum = term1-term2;
        long max = 2147483647;
        long min = -2147483647;
        if(sum > max || sum < min)
            throw new ArithmeticException("Value too low!");
        return sum;
    }

    public static int multiplication(int factor1, int factor2) {
        return factor1*factor2;
    }

    public static long division(int numerator, int denominator) {
        if(denominator == 0)
            throw new ArithmeticException("Can not divide by zero.");
        return numerator/denominator;
    }

    public static int squared(int base) {
        return base*base;
    }

    public static double root(long term) {
        if (term <= 0)
            throw new ArithmeticException("Not  allowed");
        return Math.sqrt(term);
    }

    public static String radix10(int number, int radix){

        Resources resources = new Resources();
        return resources.presentValue(number, radix);
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniraknareTest {

    @Test
    public void addition() {
        //Given
        int term1 = 2;
        int term2 = 4;
        //When
        int result = Miniraknare.addition(term1, term2);
        //Then
        assertEquals(result, 6);
    }

    @Test
    public void subtraction() {
        //Given
        int term1 = 4;
        int term2 = 2;
        //When
        int result = Miniraknare.subtraction(term1, term2);
        //Then
        assertEquals(result, 2);
    }

    @Test
    public void multiplication() {
        //Given
        int factor1 = 2;
        int factor2 = 4;
        //When
        int result = Miniraknare.multiplication(factor1, factor2);
        //Then
        assertEquals(result, 8);
    }

    @Test
    public void division() {
        //Given
        int numerator = 4;
        int denominator = 2;
        //When
        int result = Miniraknare.division(numerator, denominator);
        //Then
        assertEquals(result, 2);
    }

    @Test
    public void squaredPositive() {
        //Given
        int base = 4;
        //When
        int result = Miniraknare.squared(base);
        //Then
        assertEquals(result, 16);
    }

    @Test
    public void squaredZero() {
        //Given
        int base = 0;
        //When
        int result = Miniraknare.squared(base);
        //Then
        assertEquals(result, 0);
    }

    @Test
    public void squaredNegative() {
        //Given
        int base = -4;
        //When
        int result = Miniraknare.squared(base);
        //Then
        assertEquals(result, 16);
    }

    @Test
    public void radixBinary() {
        //Given
        int number = 4;
        int selection = 3;
        //When
        String result = Miniraknare.radix(number, selection);
        //Then
        assertEquals(result, "100");
    }

    @Test
    public void radixRome() {
        //Given
        int number = 10;
        int selection = 4;
        //When
        String result = Miniraknare.radix(number, selection);
        //Then
        assertEquals(result, "X");
    }
}
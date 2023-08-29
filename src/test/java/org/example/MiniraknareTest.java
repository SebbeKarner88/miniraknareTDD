package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MiniraknareTest {

    @ParameterizedTest
    @CsvSource(value = {"2, 4, 6", "1, 2, 3", "-1, 2, 1", "-2, -2, -4"})
    public void addition(int term1, int term2, int expected) {
        //Given When
        long result = Miniraknare.addition(term1, term2);
        //Then
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 2147483646", "-2147483646, -10", "2147483455, 9564"})
    public void additionExceptionTest(long term1, long term2) {
        // Then
        assertThrows(ArithmeticException.class, () -> {
            Miniraknare.addition(term1, term2);
        });
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 4, -2", "6, 2, 4", "234, 35, 199", "-10, -20, 10"})
    public void subtraction(long term1, long term2, long expected) {
        //Given When
        long result = Miniraknare.subtraction(term1, term2);
        //Then
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 2147483999", "-2147483646, 600", "2147483455, -9564"})
    public void subtractionExceptionTest(long term1, long term2) {
        // Then
        assertThrows(ArithmeticException.class, () -> {
            Miniraknare.subtraction(term1, term2);
        });
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

    @ParameterizedTest
    @CsvSource(value = {"4, 2 ,2", "8, 4, 2", "-4, 2, -2"})
    public void division(int numerator, int denominator, int expected) {
        //Given When
        long result = Miniraknare.division(numerator, denominator);
        //Then
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"4, 0", "-10, 0"})
    public void division(int numerator, int denominator) {
        //Then
        assertThrows(ArithmeticException.class, () -> Miniraknare.division(numerator, denominator));
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

    @ParameterizedTest
    @CsvSource(value = {"2, 1", "9, 3", "16, 4"})
    public void root(long term1, long expected) {
        //Given When
        long result = Miniraknare.root(term1);
        //Then
        assertEquals(result, expected);
    }

    @Test
    public void radixBinary() {
        //Given
        int number = 4;
        int radix = 3;
        //When
        String result = Miniraknare.radix10(number, radix);
        //Then
        assertEquals(result, "100");
    }

    @Test
    public void radixRome() {
        //Given
        int number = 10;
        int radix = 4;
        //When
        String result = Miniraknare.radix10(number, radix);
        //Then
        assertEquals(result, "X");
    }
}
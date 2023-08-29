package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
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
    @CsvFileSource(resources = "/divisionNumbers.csv")
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

    @ParameterizedTest
    @CsvFileSource(resources = "/squaredNumbers.csv")
    public void squared(int base, long expected) {
        //Given When
        int result = Miniraknare.squared(base);
        //Then
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"324, 18", "9, 3", "16, 4"})
    public void root(long term1, long expected) {
        //Given When
        double result = Miniraknare.root(term1);
        //Then
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, -9, -3})
    public void rootException(long term1) {
        //Then
        assertThrows(ArithmeticException.class, () -> Miniraknare.root(term1));
    }

    @ParameterizedTest
    @CsvSource(value = {"4, 3, 100", "10, 4, X", "14, 3, 1110"})
    public void radix(int number, int radix, String expected) {
        //Given When
        String result = Miniraknare.radix10(number,radix);
        //Then
        assertEquals(result, expected);
    }

    @Test
    public void radixException() {
        // Given
        int number = 0;
        int radix = 4;
        // Then
        assertThrows(NullPointerException.class, () -> Miniraknare.radix10(number, radix));
    }
}
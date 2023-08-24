package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniraknareTest {

    @Test
    public void addition() {
        //Given
        int a = 2;
        int b = 4;
        //When
        int result = Miniraknare.addition(a, b);
        //Then
        assertEquals(result, 6);
    }

}
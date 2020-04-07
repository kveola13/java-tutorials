package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.DateFashion.dateFashion;
import static org.junit.jupiter.api.Assertions.*;

class DateFashionTest {

    @Test
    void dateFashionTestOne() {
        assertEquals(2, dateFashion(5, 10));
    }

    @Test
    void dateFashionTestTwo() {
        assertEquals(0, dateFashion(5, 2));
    }

    @Test
    void dateFashionTestThree() {
        assertEquals(1, dateFashion(5, 5));
    }
}
package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.MakeChocolate.makeChocolate;
import static org.junit.jupiter.api.Assertions.*;

class MakeChocolateTest {

    @Test
    void makeChocolateTestOne() {
        assertEquals(4, makeChocolate(4,1,9));
    }
    @Test
    void makeChocolateTestTwo() {
        assertEquals(-1, makeChocolate(4,1,10));
    }
    @Test
    void makeChocolateTestThree() {
        assertEquals(2, makeChocolate(4,1,7));
    }
}
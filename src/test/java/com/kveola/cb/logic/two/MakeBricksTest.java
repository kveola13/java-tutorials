package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.MakeBricks.makeBricks;
import static org.junit.jupiter.api.Assertions.*;

class MakeBricksTest {

    @Test
    void makeBricksTestOne() {
        assertTrue(makeBricks(3, 1, 8));
    }

    @Test
    void makeBricksTestTwo() {
        assertFalse(makeBricks(3, 1, 9));
    }

    @Test
    void makeBricksTestThree() {
        assertTrue(makeBricks(3, 2, 10));
    }
}
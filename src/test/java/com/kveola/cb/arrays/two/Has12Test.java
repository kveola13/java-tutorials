package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Has12.has12;
import static org.junit.jupiter.api.Assertions.*;

class Has12Test {

    @Test
    void has12TestOne() {
        assertTrue(has12(new int[]{1, 3, 2}));
    }

    @Test
    void has12TestTwo() {
        assertTrue(has12(new int[]{3, 1, 2}));
    }

    @Test
    void has12TestThree() {
        assertTrue(has12(new int[]{3, 1, 4, 5, 2}));
    }

}
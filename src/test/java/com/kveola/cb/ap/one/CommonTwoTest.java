package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.CommonTwo.commonTwo;
import static org.junit.jupiter.api.Assertions.*;

class CommonTwoTest {

    @Test
    void commonTwoTestOne() {
        assertEquals(2, commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
    }

    @Test
    void commonTwoTestTwo() {
        assertEquals(3, commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
    }

    @Test
    void commonTwoTestThree() {
        assertEquals(3, commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
    }
}
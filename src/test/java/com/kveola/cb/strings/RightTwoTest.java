package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.RightTwo.right2;
import static org.junit.jupiter.api.Assertions.*;

class RightTwoTest {

    @Test
    void right2TestOne() {
        assertEquals("loHel", right2("Hello"));
    }
    @Test
    void right2TestTwo() {
        assertEquals("vaja", right2("java"));
    }
    @Test
    void right2TestThree() {
        assertEquals("Hi", right2("Hi"));
    }
}
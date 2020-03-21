package com.kveola.cb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTenTwentyTest {

    @Test
    void max1020TestOne() {
        assertEquals(19, MaxTenTwenty.max1020(11, 19));
    }

    @Test
    void max1020TestTwo() {
        assertEquals(19, MaxTenTwenty.max1020(19, 11));
    }

    @Test
    void max1020TestThree() {
        assertEquals(11, MaxTenTwenty.max1020(11, 9));
    }
    @Test
    void max1020TestFour() {
        assertEquals(0, MaxTenTwenty.max1020(9, 21));
    }
    @Test
    void max1020TestFive() {
        assertEquals(10, MaxTenTwenty.max1020(10, 21));
    }
}
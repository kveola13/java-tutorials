package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.UserCompare.userCompare;
import static org.junit.jupiter.api.Assertions.*;

class UserCompareTest {

    @Test
    void userCompareTestOne() {
        assertEquals(-1, userCompare("bb", 1, "zz", 2));
    }
    @Test
    void userCompareTestTwo() {
        assertEquals(1, userCompare("bb", 1, "aa", 2));
    }
    @Test
    void userCompareTestThree() {
        assertEquals(0, userCompare("bb", 1, "bb", 1));
    }
}
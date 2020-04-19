package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.StarOut.starOut;
import static org.junit.jupiter.api.Assertions.*;

class StarOutTest {

    @Test
    void starOutTestOne() {
        assertEquals("ad", starOut("ab*cd"));
    }

    @Test
    void starOutTestTwo() {
        assertEquals("ad", starOut("ab**cd"));
    }

    @Test
    void starOutTestThree() {
        assertEquals("silly", starOut("sm*eilly"));
    }
}
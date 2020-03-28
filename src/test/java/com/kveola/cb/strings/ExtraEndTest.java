package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.ExtraEnd.extraEnd;
import static com.kveola.cb.strings.ExtraEnd.extraEndAlt;
import static org.junit.jupiter.api.Assertions.*;

class ExtraEndTest {

    @Test
    void extraEndTestOne() {
        assertEquals("lololo", extraEnd("Hello"));
    }
    @Test
    void extraEndTestTwo() {
        assertEquals("ababab", extraEnd("ab"));
    }
    @Test
    void extraEndTestThree() {
        assertEquals("HiHiHi", extraEnd("Hi"));
    }
    @Test
    void extraEndTestFour(){
        assertEquals("dydydy", extraEnd("Candy"));
    }
    @Test
    void extraEndTestFive(){
        assertEquals("dedede", extraEnd("Code"));
    }
    @Test
    void extraEndAltTestOne() {
        assertEquals("lololo", extraEndAlt("Hello"));
    }
    @Test
    void extraEndAltTestTwo() {
        assertEquals("ababab", extraEndAlt("ab"));
    }
    @Test
    void extraEndAltTestThree() {
        assertEquals("HiHiHi", extraEndAlt("Hi"));
    }
    @Test
    void extraEndAltTestFour(){
        assertEquals("dydydy", extraEndAlt("Candy"));
    }
    @Test
    void extraEndAltTestFive(){
        assertEquals("dedede", extraEndAlt("Code"));
    }
}
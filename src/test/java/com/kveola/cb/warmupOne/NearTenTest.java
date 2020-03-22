package com.kveola.cb.warmupOne;

import com.kveola.cb.warmupOne.NearTen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearTenTest {

    @Test
    void closeTestOne() {
        assertEquals(8, NearTen.close10(8, 13));
    }
    @Test
    void closeTestTwo() {
        assertEquals(8, NearTen.close10(13, 8));
    }
    @Test
    void closeTestThree() {
        assertEquals(0, NearTen.close10(13, 7));
    }
}
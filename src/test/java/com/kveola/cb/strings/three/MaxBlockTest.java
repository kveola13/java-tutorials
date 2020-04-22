package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.MaxBlock.maxBlock;
import static org.junit.jupiter.api.Assertions.*;

class MaxBlockTest {

    @Test
    void maxBlockTestOne() {
        assertEquals(2, maxBlock("hoopla"));
    }

    @Test
    void maxBlockTestTwo() {
        assertEquals(3, maxBlock("abbCCCddBBBxx"));
    }

    @Test
    void maxBlockTestThree() {
        assertEquals(0, maxBlock(""));
    }

    @Test
    void maxBlockTestFour() {
        assertEquals(2, maxBlock("xxyz"));
    }
}
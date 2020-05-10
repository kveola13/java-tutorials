package com.kveola.cb.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.NoX.noX;
import static org.junit.jupiter.api.Assertions.*;

class NoXTest {

    @Test
    void NoXTestOne() {
        List<String> init = List.of("ax", "bb", "cx");
        List<String> done = List.of("a", "bb", "c");
        assertEquals(done, noX(init));
    }

    @Test
    void NoXTestTwo() {
        List<String> init = List.of("xxax", "xbxbx", "xxcx");
        List<String> done = List.of("a", "bb", "c");
        assertEquals(done, noX(init));
    }

    @Test
    void NoXTestThree() {
        List<String> init = List.of("x");
        List<String> done = List.of("");
        assertEquals(done, noX(init));
    }
}
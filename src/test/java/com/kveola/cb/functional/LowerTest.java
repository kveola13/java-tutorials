package com.kveola.cb.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.Lower.lower;
import static org.junit.jupiter.api.Assertions.*;

class LowerTest {

    @Test
    void LowerTestOne() {
        List<String> init = List.of("Hello", "Hi");
        List<String> done = List.of("hello", "hi");
        assertEquals(done, lower(init));
    }

    @Test
    void LowerTestTwo() {
        List<String> init = List.of("AAA", "BBB", "ccc");
        List<String> done = List.of("aaa", "bbb", "ccc");
        assertEquals(done, lower(init));
    }

    @Test
    void LowerTestThree() {
        List<String> init = List.of("KitteN", "ChocolaTE");
        List<String> done = List.of("kitten", "chocolate");
        assertEquals(done, lower(init));
    }
}
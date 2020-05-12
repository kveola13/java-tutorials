package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.NoZ.noZ;
import static org.junit.jupiter.api.Assertions.*;

class NoZTest {

    @Test
    void NoZTestOne() {
        List<String> init = List.of("aaa", "bbb", "aza");
        List<String> done = List.of("aaa", "bbb");
        assertEquals(done, noZ(init));
    }

    @Test
    void NoZTestTwo() {
        List<String> init = List.of("hziz", "hzello", "hi");
        List<String> done = List.of("hi");
        assertEquals(done, noZ(init));
    }

    @Test
    void NoZTestThree() {
        List<String> init = List.of("hello", "howz", "are", "youz");
        List<String> done = List.of("hello", "are");
        assertEquals(done, noZ(init));
    }
}
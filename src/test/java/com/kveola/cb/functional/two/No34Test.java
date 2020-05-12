package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.No34.no34;
import static org.junit.jupiter.api.Assertions.*;

class No34Test {

    @Test
    void No34TestOne() {
        List<String> init = List.of("a", "bb", "ccc");
        List<String> done = List.of("a", "bb");
        assertEquals(done, no34(init));
    }

    @Test
    void No34TestTwo() {
        List<String> init = List.of("a", "bb", "ccc", "dddd");
        List<String> done = List.of("a", "bb");
        assertEquals(done, no34(init));
    }

    @Test
    void No34TestThree() {
        List<String> init = List.of("ccc", "dddd", "apple");
        List<String> done = List.of("apple");
        assertEquals(done, no34(init));
    }
}
package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.NoLong.noLong;
import static org.junit.jupiter.api.Assertions.*;

class NoLongTest {

    @Test
    void NoLongTestOne() {
        List<String> init = List.of("this", "not", "too", "long");
        List<String> done = List.of("not", "too");
        assertEquals(done, noLong(init));
    }

    @Test
    void NoLongTestTwo() {
        List<String> init = List.of("a", "bbb", "cccc");
        List<String> done = List.of("a", "bbb");
        assertEquals(done, noLong(init));
    }

    @Test
    void NoLongTestThree() {
        List<String> init = List.of("cccc", "cccc", "cccc");
        List<String> done = List.of();
        assertEquals(done, noLong(init));
    }

}
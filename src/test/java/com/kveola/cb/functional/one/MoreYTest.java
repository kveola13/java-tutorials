package com.kveola.cb.functional.one;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.one.MoreY.moreY;
import static org.junit.jupiter.api.Assertions.*;

class MoreYTest {

    @Test
    void MoreYTestOne() {
        List<String> init = List.of("a", "b", "c");
        List<String> done = List.of("yay", "yby", "ycy");
        assertEquals(done, moreY(init));
    }

    @Test
    void MoreYTestTwo() {
        List<String> init = List.of("hello", "there");
        List<String> done = List.of("yhelloy", "ytherey");
        assertEquals(done, moreY(init));
    }

    @Test
    void MoreYTestThree() {
        List<String> init = List.of("yay");
        List<String> done = List.of("yyayy");
        assertEquals(done, moreY(init));
    }
}
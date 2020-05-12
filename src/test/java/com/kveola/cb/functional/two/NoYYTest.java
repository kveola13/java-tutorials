package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.NoYY.noYY;
import static org.junit.jupiter.api.Assertions.*;

class NoYYTest {

    @Test
    void NoYYTestOne() {
        List<String> init = List.of("a", "b", "c");
        List<String> done = List.of("ay", "by", "cy");
        assertEquals(done, noYY(init));
    }

    @Test
    void NoYYTestTwo() {
        List<String> init = List.of("a", "b", "cy");
        List<String> done = List.of("ay", "by");
        assertEquals(done, noYY(init));
    }

    @Test
    void NoYYTestThree() {
        List<String> init = List.of("xx", "ya", "zz");
        List<String> done = List.of("xxy", "yay", "zzy");
        assertEquals(done, noYY(init));
    }
}
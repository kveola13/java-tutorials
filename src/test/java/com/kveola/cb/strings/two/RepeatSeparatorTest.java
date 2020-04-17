package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.RepeatSeparator.repeatSeparator;
import static org.junit.jupiter.api.Assertions.*;

class RepeatSeparatorTest {

    @Test
    void repeatSeparatorTestOne() {
        assertEquals("WordXWordXWord", repeatSeparator("Word", "X", 3));
    }

    @Test
    void repeatSeparatorTestTwo() {
        assertEquals("ThisAndThis", repeatSeparator("This", "And", 2));
    }

    @Test
    void repeatSeparatorTestThree() {
        assertEquals("This", repeatSeparator("This", "And", 1));
    }
}
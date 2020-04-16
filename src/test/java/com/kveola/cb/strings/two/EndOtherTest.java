package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.EndOther.endOther;
import static org.junit.jupiter.api.Assertions.*;

class EndOtherTest {

    @Test
    void endOtherTestOne() {
        assertTrue(endOther("Hiabc", "abc"));
    }

    @Test
    void endOtherTestTwo() {
        assertTrue(endOther("AbC", "HiaBc"));
    }

    @Test
    void endOtherTestThree() {
        assertTrue(endOther("abc", "abXabc"));
    }
}
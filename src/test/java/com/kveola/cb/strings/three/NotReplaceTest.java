package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.NotReplace.notReplace;
import static org.junit.jupiter.api.Assertions.*;

class NotReplaceTest {

    @Test
    void notReplaceTestOne() {
        assertEquals("is not test", notReplace("is test"));
    }

    @Test
    void notReplaceTestTwo() {
        assertEquals("is not-is not", notReplace("is-is"));
    }

    @Test
    void notReplaceTestThree() {
        assertEquals("This is not right", notReplace("This is right"));
    }
}
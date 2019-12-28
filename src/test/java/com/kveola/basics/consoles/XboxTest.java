package com.kveola.basics.consoles;

import org.junit.Test;

import static org.junit.Assert.*;

public class XboxTest {
    @Test
    public void testCloneStringArray() {
        String[] array = {"Geralt", "Ciri", "Yennefer"};
        String[] clone = array.clone();
        assertNotSame(array, clone);
        assertSame(array, array);
        for (String strings : clone) {
            System.out.println(strings);
        }
    }

    @Test
    public void testCloneXbox() {
        Xbox xbox = new Xbox("Ola K");
        Xbox newXbox = xbox.clone();
        assertNotSame(xbox, newXbox);
        assertEquals("Xbox belongs to Ola K", newXbox.toString());
    }
}
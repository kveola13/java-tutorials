package com.kveola.cb.functional.one;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.one.AddStar.addStar;
import static org.junit.jupiter.api.Assertions.*;

class AddStarTest {

    @Test
    void AddStarTestOne() {
        List<String> init = List.of("a", "bb", "ccc");
        List<String> added = List.of("a*", "bb*", "ccc*");
        assertEquals(added, addStar(init));
    }

    @Test
    void AddStarTestTwo() {
        List<String> init = List.of("hello", "there");
        List<String> added = List.of("hello*", "there*");
        assertEquals(added, addStar(init));
    }

    @Test
    void AddStarTestThree() {
        List<String> init = List.of();
        List<String> added = List.of();
        assertEquals(added, addStar(init));
    }
}
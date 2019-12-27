package com.kveola.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarSelectorTest {

    @Test
    void shouldCallMain() {
        String [] arguments = {"BMW", "Porsche"};
        CarSelector.main(arguments);
    }
}
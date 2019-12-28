package com.kveola.basics.inheritance;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals(){
        Zoo zoo = new Zoo();
        Animal [] animals = {new Dog(), new Gorilla(), new Lion(), new Tiger(),};
        zoo.feedAnimals(animals);
    }
}
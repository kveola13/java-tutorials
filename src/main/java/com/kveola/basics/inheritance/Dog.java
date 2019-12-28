package com.kveola.basics.inheritance;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }

    @Override
    public void age() {

    }
}

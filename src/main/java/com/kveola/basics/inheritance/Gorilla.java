package com.kveola.basics.inheritance;

public class Gorilla extends Animal {
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName()+ " is eating");
    }

    @Override
    public void age() {

    }
}

package com.kveola.basics.inheritance;

public class Zoo {
    public void feedAnimals(Animal[] animals){
        for (Animal animal: animals){
            animal.eat();
            animal.age();
        }
    }
}

package com.kveola.basics.consoles;

import com.kveola.basics.Interfaces.Console;
import com.kveola.basics.Interfaces.Loggable;
import com.kveola.basics.Interfaces.Price;
import com.kveola.basics.Interfaces.Property;

public class Playstation implements Console, Loggable, Property, Price {
    @Override
    public void play() {
        System.out.println(Playstation.class.getName() + " playing");
    }

    @Override
    public String message() {
        return "Log for " + Playstation.class.getName();
    }

    @Override
    public String owner() {
        return Playstation.class.getName() + " is owned by " + Console.class.getName();
    }
}
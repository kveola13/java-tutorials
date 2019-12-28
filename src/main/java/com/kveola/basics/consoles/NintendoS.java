package com.kveola.basics.consoles;

import com.kveola.basics.Interfaces.Console;
import com.kveola.basics.Interfaces.Loggable;
import com.kveola.basics.Interfaces.Price;
import com.kveola.basics.Interfaces.Property;

public class NintendoS implements Console, Loggable, Property, Price {
    @Override
    public void play() {
        System.out.println(NintendoS.class.getName() + " playing");
    }

    @Override
    public String message() {
        return "Log for " + NintendoS.class.getName();
    }

    @Override
    public String owner() {
        return NintendoS.class.getName() + " is owned by " + Console.class.getName();
    }
}

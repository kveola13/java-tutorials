package com.kveola.basics.consoles;

import com.kveola.basics.Interfaces.Console;
import com.kveola.basics.Interfaces.Loggable;
import com.kveola.basics.Interfaces.Price;
import com.kveola.basics.Interfaces.Property;

public class Xbox implements Console, Loggable, Property, Price {
    @Override
    public void play() {
        System.out.println(Xbox.class.getName() + " playing");
    }

    @Override
    public String message() {
        return "Log for " + Xbox.class.getName();
    }

    @Override
    public String owner() {
        return Xbox.class.getName() + " is owned by " + Console.class.getName();
    }
}

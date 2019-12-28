package com.kveola.basics.consoles;

import com.kveola.basics.Interfaces.Console;
import com.kveola.basics.Interfaces.Loggable;
import com.kveola.basics.Interfaces.Price;
import com.kveola.basics.Interfaces.Property;

public class Xbox implements Console, Loggable, Price, Cloneable {
    private String nameOfOwner;

    public Xbox(String nameOfOwner){
        this.nameOfOwner = nameOfOwner;
    }

    public String toString() {
        return "Xbox belongs to " + nameOfOwner;
    }

    @Override
    public void play() {
        System.out.println(Xbox.class.getName() + " playing");
    }

    @Override
    public String message() {
        return "Log for " + Xbox.class.getName();
    }
    @Override
    public Xbox clone(){
        try {
            return (Xbox) super.clone();
        } catch (CloneNotSupportedException cloneException) {
            throw new AssertionError();
        }
    }
}

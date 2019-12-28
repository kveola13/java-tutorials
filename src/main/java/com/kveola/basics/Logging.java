package com.kveola.basics;

import com.kveola.basics.Interfaces.Console;
import com.kveola.basics.consoles.NintendoS;
import com.kveola.basics.consoles.Playstation;
import com.kveola.basics.consoles.Xbox;
import com.kveola.basics.enums.CarState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
    private final Logger log = LoggerFactory.getLogger(Logging.class);

    public void process(String argument) {
        CarState carState = CarState.from(argument);
    }

    public void play() {
        Console xbox = new Xbox("Ola");
        Console playstation = new Playstation();
        Console nintendoS = new NintendoS();

        Console[] consoles = {new Xbox("Ola"), new Playstation(), new NintendoS(),};

        for (Console console : consoles) {
            console.play();
        }
    }
}

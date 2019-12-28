package com.kveola.basics;

import com.kveola.basics.consoles.NintendoS;
import com.kveola.basics.consoles.Playstation;
import com.kveola.basics.consoles.Xbox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CarLogging {
    private final Logger log = LoggerFactory.getLogger(CarLogging.class);

    public void process(String argument) {
        CarState carState = CarState.from(argument);
    }
    public void play(){
        Xbox xbox = new Xbox();
        Playstation playstation = new Playstation();
        NintendoS nintendoS = new NintendoS();

        xbox.play();
        playstation.play();
        nintendoS.play();
    }
}

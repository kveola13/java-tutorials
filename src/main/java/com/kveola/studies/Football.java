package com.kveola.studies;

public class Football extends Ball {
    public String toString(){
        return String.format("Id: %d, Locker: %s, needs replacement: %b", this.ballId, this.locker, this.needsReplacement);
    }
}

package com.bowling;

public class Game {
    public void roll(int numberOfPins) {
        if(numberOfPins < 0){
            throw new IllegalArgumentException("Negative Pins not allowed ");
        }
    }
}

package com.epam.OOP;

public class Bird extends  Animal {
    public Bird() {
        super("blue", 2, false);
    }
    @Override
    public String getDescription() {
        return "This animal is mostly "+ getColor()+". It has "+ getNumberOfPaws()+(getNumberOfPaws()>1?" paws": " paw")+" and "+ (getHasFur()? "a":"no")+" fur. Moreover, it has 2 wings and can fly.";
    }
}

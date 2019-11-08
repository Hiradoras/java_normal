package com.company.mammals;

import com.company.Animal;

public class Cat extends Animal {

    public Cat(String color, Integer legs, Boolean mammal) {
        super(color, legs, mammal);
    }

    @Override
    public Boolean getMammal() {
        return true;
    }

    @Override
    public Integer getLegs() {
        return 4;
    }

    @Override
    public String getColor() {
        return "Brown";
    }
}
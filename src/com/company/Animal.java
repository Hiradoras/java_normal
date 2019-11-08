package com.company;

public class Animal {

    public Animal(String name, String color, Integer legs, Boolean mammas){

        this.color = color;
        this.legs= legs;
        this.mammal = mammal;

    }

    public Animal() {

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Animal.name = name;
    }

    private static String name;
    private String color;
    private Boolean mammal;
    private Integer legs;

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Boolean getMammal() {
        return mammal;
    }

    public void setMammal(Boolean mammal) {
        this.mammal = mammal;
    }
}


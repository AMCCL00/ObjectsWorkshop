package com.company;

public class Cat {

    private int legs;
    private boolean fur;
    private String Color;

    public Cat(int legs, boolean fur, String color) {
        this.legs = legs;
        this.fur = fur;
        Color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

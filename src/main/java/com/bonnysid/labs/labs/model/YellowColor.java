package com.bonnysid.labs.labs.model;

public class YellowColor implements Color{

    private Color nextColor;

    public YellowColor(Color nextColor) {
        this.nextColor = nextColor;
    }

    @Override
    public void invoke() {
        System.out.println("Yellow");
    }

    @Override
    public Color nextColor() {
        return nextColor;
    }
}

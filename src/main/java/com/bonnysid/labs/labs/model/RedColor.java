package com.bonnysid.labs.labs.model;

import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements Color{

    private Color nextColor;

    public RedColor(Color nextColor) {
        this.nextColor = nextColor;
    }

    @Override
    public void invoke() {
        System.out.println("Red");
    }

    @Override
    public Color nextColor() {
        return nextColor;
    }
}

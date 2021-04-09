package com.bonnysid.labs.labs.model;

import org.springframework.beans.factory.annotation.Autowired;

public class GreenColor implements Color{
    private Color nextColor;

    public GreenColor(Color nextColor) {
        this.nextColor = nextColor;
    }

    @Override
    public void invoke() {
        System.out.println("Green");
    }

    @Override
    public Color nextColor() {
        return nextColor;
    }
}

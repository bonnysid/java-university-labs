package com.bonnysid.labs.labs.model;

public class TrafficLight {

    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public void next() {
        color.invoke();
        color = color.nextColor();
    }
}

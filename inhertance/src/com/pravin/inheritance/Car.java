package com.pravin.inheritance;

public class Car {
    int cc;

    int wheel;

    String color;

    public Car(int cc, int wheel, String color) {
        this.cc = cc;
        this.wheel = wheel;
        this.color = color;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cc=" + cc +
                ", wheel=" + wheel +
                ", color=" + color +
                '}';
    }
}

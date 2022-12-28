package com.pravin;

public class Car {
    int Wheel;
    int cc;
    String Color;

    public Car(int wheel, int cc, String color) {
        Wheel = wheel;
        this.cc = cc;
        Color = color;
    }

    public int getWheel() {
        return Wheel;
    }

    public void setWheel(int wheel) {
        Wheel = wheel;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Wheel=" + Wheel +
                ", cc=" + cc +
                ", Color='" + Color + '\'' +
                '}';
    }
}


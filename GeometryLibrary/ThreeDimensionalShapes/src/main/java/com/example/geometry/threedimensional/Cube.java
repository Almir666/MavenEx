package com.example.geometry.threedimensional;

public class Cube {
    private final double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}

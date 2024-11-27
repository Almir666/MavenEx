package com.example.geometry.threedimensional;

public class Sphere {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

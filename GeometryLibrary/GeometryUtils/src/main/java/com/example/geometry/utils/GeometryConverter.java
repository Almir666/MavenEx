package com.example.geometry.utils;

public class GeometryConverter {
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30.48;
    }
}

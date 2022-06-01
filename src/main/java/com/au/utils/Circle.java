package com.au.utils;

public class Circle implements IShape {

    private double r;

    public String getName() {
        return "circle";
    }

    public double getArea() {
        return 3.14 * this.r * this.r;
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.r;
    }
}

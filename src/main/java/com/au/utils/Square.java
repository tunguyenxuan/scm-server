package com.au.utils;

public class Square implements IShape {

    private double x;

    public String getName() {
        return "square";
    }

    public double getArea() {
        return this.x * this.x;
    }

    public double getPerimeter() {
        return 4 * this.x;
    }
}

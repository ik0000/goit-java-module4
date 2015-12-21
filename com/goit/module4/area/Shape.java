package com.goit.module4.com.goit.module4.area;

public class Shape {
    double shape;

    public double Shape (double radius){
        //circle
        return Math.PI * Math.pow(radius,2);
    }

    public double Shape (double a, double b, double  c ) {
        //triangle
        double s = (a + b + c) / 2;
        double x = ((s) * (s - a) * (s - b) * (s - c));
        double Area = Math.sqrt(x);
        return Area;

    }
    public double Shape (double a, double b) {
        //rectangle
        return a*b;

    }

}

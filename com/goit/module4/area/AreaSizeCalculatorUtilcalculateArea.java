package com.goit.module4.com.goit.module4.area;

public class AreaSizeCalculatorUtilcalculateArea {

    public static double areaCalc(Circle circle) {
        //circle
        double rad1 = circle.getRadius();
        return Math.PI * Math.pow(rad1, 2);
    }

    public static double areaCalc(Rectangle rectangle) {
        //rectangle
        double a1 = rectangle.getA();
        double b1 = rectangle.getB();
        return a1 * b1;
    }

    public static double areaCalc(Triangle triangle) {
        //triangle
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        double s = (a + b + c) / 2;
        double x = ((s) * (s - a) * (s - b) * (s - c));
        double area = Math.sqrt(x);
        return area;
    }
}

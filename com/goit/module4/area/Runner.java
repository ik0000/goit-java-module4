package com.goit.module4.com.goit.module4.area;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Circle Area:");
        System.out.println(AreaSizeCalculatorUtilcalculateArea.areaCalc(new Circle(1)));
        System.out.println("Rectangle Area:");
        System.out.println(AreaSizeCalculatorUtilcalculateArea.areaCalc(new Rectangle(2,3)));
        System.out.println("Triangle Area:");
        System.out.println(AreaSizeCalculatorUtilcalculateArea.areaCalc(new Triangle(2,3,4)));

    }
}

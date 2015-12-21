package com.goit.module4.com.goit.module4.area;

public class Runner {

    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        double radius = 1;

        Shape shape = new Shape();

        System.out.println("Triangle Area with given sides of :"  + a +" , " +b+ " and "+c +" has area of "+ shape.Shape(a,b,c));
        System.out.println("Circle with radius" +radius+ "has area of: "+shape.Shape(radius));
        System.out.println("Rectangular with sides " + a +" and " +b+ " has area of: "+shape.Shape(a,b));
    }
}

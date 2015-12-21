package com.goit.module4.unitConverter;

    public class Runner {

        public static void main(String[] args) {
            double celsius = 0.0;
            double farenheit = 32;

            Converter conv = new Converter();
            System.out.println("32 F should be 0 C, let's see the answer ==> " + conv.convertToCelsius(farenheit));
            System.out.println("0 C should be 32 F, let's see the answer ==> " + conv.convertToFarenheit(celsius));
            /*Shape shape = new Shape();

            System.out.println("Triangle Area with given sides" +shape.Shape(a,b,c));*/
        }
    }


package com.goit.module4.unitConverter;

public class Converter {

    public static double convertUtil(Celsius c) {
        // Celsius to Farenheit
        double cel = c.getCelsius();
        return cel * 5 / 9 + 32;
    }
    public static double convertUtil(Farenheit f) {
        // Farenheit to Celsius
        double far = f.getFarenheit();
        return ((far - 32) * 5 / 9);
    }
}
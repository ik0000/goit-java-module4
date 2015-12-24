package com.goit.module4.unitConverter;

public class Converter {

    public static double convertUtilC2F(double c) {
        return c * 5 / 9 + 32;
    }
    public static double convertUtilF2C(double f) {
        return ((f - 32) * 5 / 9);
    }

    }
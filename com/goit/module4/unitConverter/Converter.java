package com.goit.module4.unitConverter;

public class Converter {

        public double convertToCelsius(double far)
        {
            return ((far-32)*5/9);
        }

    public double convertToFarenheit(double cel)
    {
        return cel*5/9 + 32;
    }
    }

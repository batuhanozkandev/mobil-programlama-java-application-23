package com.example.batuhanozkanmobilprogramlamavize23;

public class DegreeConvertors {
    //C -> F
    public String celciusToFahrt(double value){
        double result = (value * 1.8) + 32;
        return String.valueOf(result);
    }
    //C -> K
    public String celciusToKelvin(double value){
        double result = value + 273.15;
        return String.valueOf(result);
    }
}

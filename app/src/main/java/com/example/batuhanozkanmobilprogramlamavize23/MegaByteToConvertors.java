package com.example.batuhanozkanmobilprogramlamavize23;


public class MegaByteToConvertors {
    //MB -> KiloByte
    public String mbToKiloByte(double value){
        double result = value * 1024;
        return String.valueOf(result);
    }
    //MB -> Byte
    public String mbToByte(double value){
        double result = value * 1024 * 1024;
        return String.valueOf(result);
    }
    //MB -> KibiByte
    public String mbToKibiByte(double value){
        double result = value * 9765625;
        return String.valueOf(result);
    }
    //MB -> Bit
    public String mbToBit(double value){
        double result = value * 8000000;
        return String.valueOf(result);
    }
}

package com.example.batuhanozkanmobilprogramlamavize23;

public class DecimalToHexadecimal {

    public String decimalToHexadecimal(int value) {
        // 10luk sayıyı 16'lık sayıya dönüştürmek için bir dizi oluşturun
        char[] hexadecimal = new char[8]; // En fazla 8 karakterlik bir 16'lık sayı olabilir
        int index = 0; // Dizinin son indeksini tutmak için bir değişken

        // 10luk sayı sıfır olana kadar bölme işlemi yapın
        while (value > 0) {
            // 10luk sayının 16'ya bölümünden kalanı bir karakter olarak atayın
            int remainder = value % 16;
            // Kalan 10'dan küçükse, ilgili rakamı kullanın
            if (remainder < 10) {
                hexadecimal[index] = (char) (remainder + '0');
            }
            // Kalan 10'dan büyükse, ilgili harfi kullanın
            else {
                hexadecimal[index] = (char) (remainder - 10 + 'A');
            }
            // 10luk sayıyı 16'ya bölün
            value = value / 16;
            // Dizinin son indeksini bir artırın
            index++;
        }

        // Diziyi ters çevirerek 16'lık sayıyı yazdırın
        StringBuilder sb = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            sb.append(hexadecimal[i]);
        }
        return sb.toString();
    }
}

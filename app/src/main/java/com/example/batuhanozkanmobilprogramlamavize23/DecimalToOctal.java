package com.example.batuhanozkanmobilprogramlamavize23;

public class DecimalToOctal {

    public String decimalToOctal(int value) {
        // 10luk sayıyı 8'lik sayıya dönüştürmek için bir dizi oluşturun
        int[] octal = new int[11]; // En fazla 11 basamaklı bir 8'lik sayı olabilir
        int index = 0; // Dizinin son indeksini tutmak için bir değişken

        // 10luk sayı sıfır olana kadar bölme işlemi yapın
        while (value > 0) {
            // 10luk sayının 8'e bölümünden kalanı dizinin son elemanı olarak atayın
            octal[index] = value % 8;
            // 10luk sayıyı 8'e bölün
            value = value / 8;
            // Dizinin son indeksini bir artırın
            index++;
        }

        // Diziyi ters çevirerek 8'lik sayıyı yazdırın
        StringBuilder sb = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            sb.append(octal[i]);
        }
        return sb.toString();
    }
}

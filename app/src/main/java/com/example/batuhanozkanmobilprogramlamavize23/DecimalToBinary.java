package com.example.batuhanozkanmobilprogramlamavize23;

public class DecimalToBinary {

    public String decimalToBinary(int value) {
        int[] binary = new int[32]; // En fazla 32 bitlik bir 2'lik sayı olabilir
        int index = 0; // Dizinin son indeksini tutmak için bir değişken

        // 10luk sayı sıfır olana kadar bölme işlemi yapın
        while (value > 0) {
            // 10luk sayının 2'ye bölümünden kalanı dizinin son elemanı olarak atayın
            binary[index] = value % 2;
            // 10luk sayıyı 2'ye bölün
            value = value / 2;
            // Dizinin son indeksini bir artırın
            index++;
        }
        // Diziyi ters çevirerek 2'lik sayıyı yazdırın
        StringBuilder sb = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            sb.append(binary[i]);
        }
        return sb.toString();
    }
}

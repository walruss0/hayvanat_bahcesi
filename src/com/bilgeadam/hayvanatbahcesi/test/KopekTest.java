package com.bilgeadam.hayvanatbahcesi.test;

import com.bilgeadam.hayvanatbahcesi.Kopek;

public class KopekTest {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek();
        kopek1.sesCikar();

        kopek1.setKopekCins("Doberman");
        System.out.println(kopek1.getKopekCins());
        kopek1.setAgirlik(20);
        kopek1.setAd("Çomak");
        kopek1.setUzunluk(2);

        System.out.println(kopek1);
    }
}

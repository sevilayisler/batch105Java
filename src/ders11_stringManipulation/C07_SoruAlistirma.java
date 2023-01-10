package ders11_stringManipulation;

import java.util.Locale;

public class C07_SoruAlistirma {
    public static void main(String[] args) {

        // soru 6: kullanicidan isim ve soy ismini ayri ayri alin
        // isim daha uzun ise ,isim ve soysimi ilk harf büyük
        // kalanlar kücük sekliyle yazdirin
        // Soyisim daha uzun ise  ismi ilk harf büyük digerleri kücük//
        // sayismi büyük harflerle yazdirin

        String isim = "gayretliazimli";
        String soyisim = "huzurlubasarili";
        String yeniIsimSoyisim;

        if (isim.length() > soyisim.length()) {
            yeniIsimSoyisim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " +

                    soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

            System.out.println(yeniIsimSoyisim);

        } else  {

yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" " +
        soyisim.toUpperCase();
            System.out.println(yeniIsimSoyisim);
        }
    }
}
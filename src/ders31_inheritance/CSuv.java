package ders31_inheritance;

public class CSuv extends BinekArac {
    public static void main(String[] args) {

        CSuv suv1 = new CSuv();

        System.out.println(suv1.marka); //Binek araclarin markasi vardir
        System.out.println(suv1.model); //Binek araclarin modeli olur
        System.out.println();// tüm araclar motor kullanir
        System.out.println();// tüm araclarin plakasi olur
        System.out.println();//Araclar farkli yakitlat kullanir
        System.out.println(suv1.yil);// 1900
        suv1.hiz();// binek arcalarin hizi modele göre degisir
        suv1.teker();// binek arclarin 4 tekeri olur

        CSuv suv2 = new CSuv();
        suv2.marka = "Toyota";
        suv2.model = "HRV";
        suv2.motor = "1.6";
        suv2.plaka = "06 ANK 006";
        suv2.yakit = "benzin";
        suv2.yil = 2012;
    }

    public void hiz(String yakit) {
        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinlik SUV'ler max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV'ler max 260 km hiz yapar");

        } else if (yakit.equalsIgnoreCase("hibrit")) {

            System.out.println("Hirbit SUV'ler max 220 km hiz yapar");
        } else {
            System.out.println("Byakit belli degil,max hiz söyleyemem");
        }
    }
}
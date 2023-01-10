package ders11_stringManipulation;

public class C06_Soru {
    public static void main(String[] args) {

        // kullanicidan bir cümle alin
        // cümlede ev geciyorsa; "home home sweet home " yazdirin
        // cümlede is geciyorsa,"calismak güzeldir"
        // ikisinide iceriyorsa"hem ev lazim hem is"
        // hic birini icermiyorsa "cok calisman lazim" yazdirin

        String cumle = "Eve geldim isler birikmis";

        // en dar kapsamlidan cözmeye baslamam  lazim yani
        // hem ev hem is iceriyorsa
        //  kafam rahat etsin diye büyük harf
        //  kücük harf meselesini cözerim

        String cumleCoppy=cumle.toLowerCase();

        if (cumleCoppy.contains("ev") && cumleCoppy.contains("is")) {
            System.out.println("hem ev lazim hem is");


        }else  if (cumleCoppy.contains("ev")) {
            System.out.println("home home sweet home ");


        } else if (cumleCoppy.contains("is")) {

            System.out.println("calismak güzeldir");




        } else {

            System.out.println("cok calisman lazim" );


        }
    }
}
package ders12_forLoops;

public class C05_DikkatEdilecekb {
    public static void main(String[] args) {

//ilk deger icin bitis sarti true olmuyorsa
        // for badisi devreye girmez


        for (int i = 0; i > 10; i++) {
            System.out.println(i);
        }
// Bir loopu sonunu beklemeden bitirmek istrsek 

// 103   sayisinin asal olup olmadigini bulun

        int sayi = 103;
// int bayrak=0;

        boolean bayrak = false;
// ! ve kendisi disinda hic bir tamsayiya bölünemeyen sayi

        for (int i = 2; i <= sayi - 1; i++) {

            if (sayi % i == 0) {

                // askimiz bitti

                bayrak = true;

                break;
            }
        }
        // asalMi = true;  // bu sart

        // break; // sart degil
        System.out.println(bayrak);

        if (bayrak) {

        System.out.println("asal sayi");

    }else{


            System.out.println("asal sayi degil");

        }
    }

}







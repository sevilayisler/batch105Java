package ders12_forLoops;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

// kullanicinin verdigi sayinin rakamlar taoplamini bulun.

        int sayi = 1453;

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <= 4; i++) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami = rakamlarToplami + birlerBasamagi;

            sayi = sayi / 10;
        }
        System.out.println(rakamlarToplami);


        long sayi1 = 45666178788L;

        String sayiStr = "" + sayi1; // int sayi'yi String yaptik

        for (int i = 0; i < sayiStr.length(); i++) {
            System.out.println(rakamlarToplami);
        }
    }

}

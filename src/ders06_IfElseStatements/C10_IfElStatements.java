package ders06_IfElseStatements;

public class C10_IfElStatements {
    public static void main(String[] args) {
        // kullanicidan cinsiyetini ve yasini alin Kadin 60 yas
        // ve üzeri,Erkek 65yyas ve üzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak  "Emekli
        // olabilirsiniz veya emekli olabilmek icin...yıl calismalisiniz,"

        char cinsiyet = 'E';
        int yas = 60;

        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Emekli olabilirsiniz");

        } else if ( cinsiyet == 'E' && yas < 65 && yas>15) {
            System.out.println("Emekli olmak icin  "
                    + (  65- yas) +" " +"yil daha calismalisiniz");
        }else if( cinsiyet == 'K' && yas >= 60) {
            System.out.println("Emekli olabilirsiniz");
        }else if ( cinsiyet == 'K' && yas<60 && yas>15){
        System.out.println("Emekli olmak icin  "
                    + (  60- yas) +" "+ "yil daha calismalisiniz");

        }else{
            System.out.println("Gecersiz giris");
        }
}}

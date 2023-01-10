package ders09_StringManipulations;

public class C05_lenght {
    public static void main(String[] args) {
   String str="Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length()); // 34
        // son karakteri yazdirin

        System.out.println(str.charAt(33));  // u
        System.out.println(str.charAt(str.length()-1));  //  u    son karakteri elde etmek icin kullanilir.

        //sondan ücüncü karakterini yaziniz.
        System.out.println(str.charAt(str.length()-3));// g


    }







}

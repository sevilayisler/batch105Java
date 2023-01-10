package ders09_StringManipulations;

import java.util.Locale;

public class C06_substring {
    public static void main(String[] args) {
     String str="Java ögren, isi kap";
        System.out.println(str.substring(5));  //  ögren,isi kap
        System.out.println(str.substring(0));  //Java ögren,ısi kap
        System.out.println(str.length());  //19

        // son karakteri String olarak kaydedin
        String sonHarf=""+str.charAt(str.length()-1);

        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);    //p

        // son indexteki karakteri upper Case olarak yazdirin.
        System.out.println(str.substring(str.length()-1).toUpperCase());  // P

        // son 5 harfi büyük harf olarak yazdirin
        System.out.println(str.substring(str.length()-5).toUpperCase());  // İ KAP
    }





}

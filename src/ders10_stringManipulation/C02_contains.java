package ders10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
 // icermek manasında...true   false döner

        String str="Java ile kodlama cok zevkli";
        System.out.println(str.contains("cok"));  // true
        System.out.println(str.contains("odla")); // true
        System.out.println(str.contains("a"));    //true
        //char olarak 'a' yı yazsak kabul etmiyor.
        //
        // System.out.println(str.contains('a'));
        // CharSeguance: char dizisi(karakter)

        System.out.println(str.contains("java")); // false kücük harle
        // yazildigi icin

        String str2="Java";
        System.out.println(str.contains(str2)); // true

        String str3="234 Ali Can";
        //str3.contains(2); kabul etmez." " olmali
    str3.contains("2");







    }





}

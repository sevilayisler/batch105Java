package ders10_stringManipulation;

public class C03_starWith {
    public static void main(String[] args) {

        // Starwith iki sekilde kullanilir 1.
    String str="manti acarken java ögrenilemez";

        System.out.println(str.startsWith("Manti")); // false  kücük harf
        System.out.println(str.startsWith("m")); //true
        System.out.println(str.startsWith("manti acarken java ögrenilemez"));//true
        System.out.println(str.startsWith(""));// true

        // 2. kullanim sekli

        System.out.println(str.startsWith("acarken" ,6)); //true
        System.out.println(str.startsWith("manti",0)); // true
        System.out.println(str.startsWith("java",10)); // false






    }



}

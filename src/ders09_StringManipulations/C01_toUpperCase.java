package ders09_StringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {
    String str="java Mutluluktur";
        System.out.println(str.toUpperCase()); //JAVA MUTLULUKTUR.
        System.out.println(str);//Java Mutluluktur

        //atamayapmazsak kalıcı olmaz.
        str=str.toUpperCase();
        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR

        str ="ince mehmet";
        str=str.toUpperCase();
        System.out.println(str); // INCE MEHMET // ingilizce yapar

        str=str.toLowerCase();
        System.out.println(str);// ince mehmet

        System.out.println(str.toUpperCase(Locale.CHINA));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr" )));













    }










}

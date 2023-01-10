package ders09_StringManipulations;

public class C03_equalsIgnorCase {
    public static void main(String[] args) {

    String str1="Ali";
    String  str2="ali";
    String str3="ALI";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false


        System.out.println(str1.equalsIgnoreCase(str2));  //true
        System.out.println(str1.equalsIgnoreCase(str3));  //true

        System.out.println(str1.equalsIgnoreCase("Ali ")); // false   Bosluklari karakter sayar.
                                                                                // Ayni metin kabul etmez

        // equalsIgnoreCase ayni metinde büyük kücük harflerikullanilarak olusturulan
        // farkli metinleri birbirine esit olarak kabul eder

//yani equalsİgnorcaseicin Ali ali ALi ALI AlI aLi farketmez ama kelimede
// farklilik varasabunlari tolere etmez
// a li ile ali birbirine esit degildir





    }
}

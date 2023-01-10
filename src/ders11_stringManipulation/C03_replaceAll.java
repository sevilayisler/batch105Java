package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
   String str="J1ava2 G9uzel5dir8";
   // 2. satirdaki sayilari silip metni Java Güzeldir haline dönüstürelim
   // str.replaceAll() sedece bir harf veya char seguance'i
   // degil genelleme ile söyleyebilecegimiz ortak özellikteki
   // tüm karakterleri de degistiriir

    System.out.println(str.replaceAll("\\d",""));// Java Güzeldir

    System.out.println(str.replaceAll("\\D",""));// 12958

String s1="ilk ürün fiyati: 1250";
String s2="ikinci ürün fiyati:1500 tl";

      //   Ragex(Regular Expressions)Kısaltmalar

//   \\s : space                     \\S :space olmayan

//   \\s+:yanyana birden fazla space

//    \\d :digitis                    \\D : digit olmayan hersey         \\

//    \\w :harf veya rakam            \\W :harf veya rakam olmayan hersey



// iki ürünün fiyatini toplayin
s1=s1.replaceAll("\\D","");//12501500
s2=s2.replaceAll("\\D","");//2750

    }
}

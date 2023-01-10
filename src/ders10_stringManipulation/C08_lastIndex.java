package ders10_stringManipulation;

public class C08_lastIndex {
    public static void main(String[] args) {
  //lastIndex   sondan bulur ama sayım bastan baslar
  //sonuc int verir.Yoksa -1 verir
  // char kabul eder

    String  str="Java hafiften beyin yakiyor";

    System.out.println(str.lastIndexOf("a")); // 21
    System.out.println(str.lastIndexOf('a')); // 15
    System.out.println(str.lastIndexOf("java")); //-1
    System.out.println(str.lastIndexOf("Java"));// 0
    System.out.println(str.lastIndexOf("e",14)); // 11
       // Java hafiften b  // sndan ikinci  e  11 de





    }
}

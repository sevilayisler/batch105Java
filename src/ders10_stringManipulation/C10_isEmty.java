package ders10_stringManipulation;

public class C10_isEmty {
    public static void main(String[] args) {
      // isEmpty
      //  bos olup olmadigi noktasinda true /false
      //isBlank
      // space karakterini bulmak icin olusturulmustur

    String  str="";
        System.out.println(str.isEmpty()); // true

        str="  ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true

        str="x";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false

    }



}

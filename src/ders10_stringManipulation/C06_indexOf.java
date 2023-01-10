package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9
        System.out.println(str.indexOf('c')); // 8
        System.out.println(str.indexOf("hersey")); // 15

        System.out.println(str.indexOf("e", 9)); // 13

        // 13 index inden sonrski ilk e nin indeksini bulun
        System.out.println(str.indexOf("e", 14)); // 16     13 den sonrası dersek
        //olmaz .14 dememiz daha mantikli.

        // cümledeki ikinci c nin index ini yazdirin
        int ilkindex =(str.indexOf("c")); // 8
        System.out.println(str.indexOf("c", ilkindex + 1));//22

        System.out.println(str.indexOf("ali")); // -1


    }
}

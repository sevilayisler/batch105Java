package ders17_scope;

public class C04_ClassVariables {
    public static void main(String[] args) {
        // C03 teki hastane ismini yazdirmak istesek

        System.out.println(C03_ObjectVariables.hastaneismi);//Yildiz hastanesi
        System.out.println(C03_ObjectVariables.hastaSayisi);//23453
        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi);// 23456

    }//Kod takibi main metoddan baslar main methodun
   // sonuna gelindiginde hersey biter.Tüm degisiklikler resetlenir
    //varible degerleri baslangic hallerine geri döner
public static  void method1(){
     C03_ObjectVariables.hastaSayisi++;
}

}
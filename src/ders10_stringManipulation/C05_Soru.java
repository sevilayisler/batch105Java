package ders10_stringManipulation;

public class C05_Soru {
    public static void main(String[] args) {

 /*     mail kontrolü yapan bir program hazirlayiniz.
     1.mail @ isareti icermiyorsa "Gecersiz mail"
     2.@gmail.com icermiyorsa"gmail adresi giriniz
     3.@gmail.com ile bitmiyorsa "yazim hatasi"
     seklinde sonuc yazdirin.

      */

        String email="53531@gmail.com";
if (!email.contains("@")) {
    System.out.println("Gecersiz mail");


} if( !email.contains("@gmail.com")) {
            System.out.println("@gmail adresi giriniz");
        }
   if (!email.endsWith("@gmail.com")){
        System.out.println("yazim hatasi");

    }else {
    System.out.println("email başarı ile kaydedilmistir");
    }
}
    }
package ders09_StringManipulations;

public class C07_Substring {
    public static void main(String[] args) {
    String str="Java gün gectikce güzellesiyor";
    // substring baslangic ve bitis

        System.out.println(str.substring(5,8));  // gün
        // 5.karakterden başlar(5,8) karakter yazdirir.
        // 5.index dahil(inclusive),8.index haric(exclusive)
        // gectikce yazdirin

        System.out.println(str.substring(9,17));  // gectikce
        System.out.println(str.substring(3,7));   //o gü


        String isim="huseYIN";
        // Verilen ismi ilk harfi  büyük geri kalan harfleri
        // kücük harf olarak kaydedin

         isim =isim.substring(0,1).toUpperCase()+  //ilk harfi büyük harf yaptik
              isim.substring(1).toLowerCase();  // 1. index ve sonrasini alip kücük harf yaptik
              System.out.println(isim);  //Huseyin

        System.out.println(isim.substring(2,5));  //sey

        //sadece 3.indexdeki harfi yazdirin     e
        System.out.println(isim.substring(3,4));  // e

        System.out.println("zor sorunun cevabi:" + isim.substring(2,2));    // "" hicilik yazdirir

       // System.out.println(isim.substring(5,2));  // hata verir











    }
}

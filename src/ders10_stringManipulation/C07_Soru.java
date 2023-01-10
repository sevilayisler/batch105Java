package ders10_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {


 /*
 Kullanicidan bir cümle ve bir metin alin
 Cümlede metnin durumuna göre

  1-Cümle metni icermiyor
  2-Cümle metni sadece 1 kere iceriyor
  3-Cümle metni birden fazla iceriyor

  seceneklerinden uygun alani yazdirin.

*/
        String cumle = "Java cok güzeldir cok.";
        String metin = ("güzeldir"); // böyle atama yapmazsak degisik
        // metinler girmemiz zor olurdu
        // contains(metin) cift tırnakta alinmadi
        // cift tirnak icinde yanlis sonuc verir.

        if (!cumle.contains(metin)) {
            System.out.println("Cumle metni icermiyor");

        } else {
            int ilkIndex = cumle.indexOf(metin); // 5
            int ikinciIndex = cumle.indexOf(metin, ilkIndex +1); //ya -1 olacak yada
                                                                          // yada bir index

            if (ikinciIndex == (-1)) {
                System.out.println("Cumle metni sadece 1 kere iceriyor");

            } else {

                System.out.println("cumle metni birden fazla iceriyor");


            }

        }

    }

}


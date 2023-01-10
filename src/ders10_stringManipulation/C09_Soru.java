package ders10_stringManipulation;

public class C09_Soru {
    public static void main(String[] args) {

    /*
 Kullanicidan bir cümle ve bir metin alin
 Cümlede metnin durumuna göre

  1-Cümle metni icermiyor
  2-Cümle metni sadece 1 kere iceriyor
  3-Cümle metni birden fazla iceriyor

  seceneklerinden uygun alani yazdirin.

*/
        String cumle = "Ben ailemi seviyorum cok ama cok seviyorum.";
        String metin = "ben";

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);
        if (ilkIndex == -1) {
            System.out.println("Cümle metni icermiyor");

        } else if (ilkIndex == sonIndex) {
        System.out.println("Cümle metni sadece 1 kere iceriyor");
    } else{

            System.out.println("Cümle metni birden fazla iceriyor");
    }
}}
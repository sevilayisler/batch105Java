package ders10_stringManipulation;

public class C07_CalismalarimSoru {
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


        if (!cumle.contains(metin)) {

            System.out.println("Cümle metni icermiyor");


        } else {

            int ilkIndex = cumle.indexOf(metin);
            int sonIndex = cumle.indexOf(metin, ilkIndex + 1);
            if (sonIndex == (-1)) {
                System.out.println("Cümle metni sadece 1 kere iceriyor");

            } else {

                System.out.println("Cümle metni birden fazla iceriyor");
            }
            }
            }
        }
package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

   String str="Java candir";

   System.out.println(str.replace('a','A')); // JAvA cAndir

   System.out.println(str.replace(' ', '_')); // Java_candir

   System.out.println(str.replace("candir","cok güzeldir."));// java cok güzeldir

   System.out.println(str.replace(" ","")); // Javacandir.


  // String deki tüm 'a'lari silin
   System.out.println(str.replace("a","")); // Jv cndir

  // Java yerine Hava, candir yerine cok güzel yazdiralim//
   System.out.println(str.replace("Java","hava")
           .replace("candir","cok güzeldir"));
           // hava   // cok güzeldir

   System.out.println(str.replace("","_"));
    // J_a_v_a_ _c_o_k_ _c_a_n_d_i_r_

   // sadece 1. a yi A yazdirin.
    System.out.println(str.replaceFirst("a","A")); //JAva candir
    }
}

package ders13_nestedForLoop_methodOlusturma;

public class C02_StringTersAlistirma {
    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.


        String input="java cok güzeldir";

        for (int i = input.length()-1; i >= 0; i--) {
            System.out.println(input.charAt(i));
        }



    }



}

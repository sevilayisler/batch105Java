package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop {
    public static void main(String[] args) {

// Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

      String input="Java cok  güzeldir";


        for (int i = input.length()-1; i >=0 ; i--) {


            System.out.print(input.charAt(i));
        }
    }
}

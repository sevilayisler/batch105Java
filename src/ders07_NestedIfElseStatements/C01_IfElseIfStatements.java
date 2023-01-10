package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
//kullanicidan  kilo (kg)ve boyunu(cm) olarak isteyip
//kilo vücut endeksini hesaplayin
//(kilo*10000/(boy*boy))
//vücüt kitle endeksi 30 dan büyükse obez

//25-30 arasi ise kilolu

//20-25 arasi ise normal
//20 den kücükse zayif yazdirin.
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen kilonuzu kg cinsinden  giriniz");
        double kilo = scan.nextDouble();

        System.out.println("lütfen boyunuzu cm olarak giriniz");
        double boy = scan.nextDouble();

        double vke=(kilo*10000/(boy*boy));
        System.out.println("vücut kitle endeksiniz:"+ vke);
        if (vke>30){
            System.out.println("obez");

        }else if (vke>25){
            System.out.println("kilolu");

        }else if (vke>20){
            System.out.println("normal");

        }else if (vke >0){
            System.out.println("zayif");

        }else{
            System.out.println("gecersiz giris");

        }

// not degerleri girerken dikkat: örnrk kilo 45,1
       // boy 162
 // (kilo*10000/(boy*boy));//(boy*boy)paranteze dikkat


    }


}

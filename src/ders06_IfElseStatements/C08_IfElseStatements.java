package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ücgen icin üc kenar uzunlugu giriniz,");
    //soru:Kullanıcıdan bir ücgenin üc kenar uzunlugunu alin.
        // Ücgen es kenar ise eskenarücgen yazdırin.

    int kenar1=scan.nextInt();
    int kenar2=scan.nextInt();
    int kenar3=scan.nextInt();
if( kenar1<=0  || kenar2<=0  || kenar3<=0) {
    System.out.println("Gecersiz kenar uzunlugu");
        }else if (kenar1==kenar2 && kenar2==kenar3){
    System.out.println("Eskenar ücgen");
        }else{
    System.out.println("Eskenar ücgen degil");
        }








    }


}

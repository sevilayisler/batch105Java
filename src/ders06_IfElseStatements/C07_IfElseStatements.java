package ders06_IfElseStatements;

import java.util.Scanner;

public class

C07_IfElseStatements {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karekter giriniz");
        char krt=scan.next().charAt(0);
        if (krt>='a' && krt<='z'){
           //kücük harf icin
           // System.out.println((char) (krt-32));
            System.out.println((Character.toUpperCase(krt)));


        }else{
            // kücük harf degil demektir

            System.out.println(krt);
        }


    }
}

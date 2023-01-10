package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin iki" +
                " kenarini girin iki kenaruzunluğuarasında entere basın");

        double kenar1=scan.nextDouble();

        double kenar2=scan.nextDouble();

        System.out.println("dikdörtgenin alanı:" +kenar1* kenar2);

    }







}

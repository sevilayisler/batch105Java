package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="java güzeldir\n";

        System.out.println(str.repeat(4));
        // java güzeldir java güzeldie..

        str="    java güzeldir  ";

        System.out.println(str.length());// 19

        // trim  bastaki  ve sondaki spaceleri siler

        str=str.trim();

        System.out.println(str); // java güzeldir
        System.out.println(str.length()); // 13


    }
}

package ders11_stringManipulation;

public class C01_nullpinter {
    public static void main(String[] args) {

    String str1="";

    //  str1 deger atanmamıstir

    System.out.println(str1); // hiclik yazdirir,
    System.out.println(str1.concat("Java")); // java

    String str2;
    //str2 olusturuldu ama deger atanmadi
    //   System.out.println(str2);  // str2 ye deger atanmadigi icin
                                    // yazdirilamaz.CTE verir.
        // System.out.println(str2.concat("Java")); //deger
        // atanmadigi icin method ile kullanilamaz.

        str2="jJava candir";
        System.out.println(str2.concat(".")); // Java candir.

        String str3=null;  // str3 deger atanmamistir
        // null pointer ile javaya deger atamadigimizin farkinda
        // olmamizi saglariz
        // null kodumuzun calisir olmasini saglar

        System.out.println(str3); // null isaretlendigini yazdirir
        //System.out.println(str3+"Java"); // nullPointerException

        System.out.println(str3+"Java"); // nullJava
        System.out.println(str3.toUpperCase()); // nullpointerException

    }
}

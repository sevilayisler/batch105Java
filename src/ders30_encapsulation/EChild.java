package ders30_encapsulation;

public class EChild extends DParent {
    /*
    javadaki inheritancein insanlardan en büyük farki insanlarda
    parent child edinebilir ama child parentini secemez.Javada ise
    tam tersidir.
    Siz bir class olusturdugunuzda daha önce olusturulmus classlardan
    tüm özelliklerini inherit etmek istediginiz clasi PARENT EDERSİNİZ
       Bir class baska bir clasi inherit etmek istediginde extends keyword ile

             bunu declare eder


     */
    public static void main(String[] args) {


        EChild child1=new EChild();
        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;


        
    }
}
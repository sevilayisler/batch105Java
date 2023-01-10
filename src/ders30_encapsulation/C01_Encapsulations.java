package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {

        AEncapsuleClass pers1=new AEncapsuleClass();
        // pers1 hastane ismi"Java hastanesi": private oldugu icin grülmez
        //pers1 hastaUcreti=1000 private oldugu icin kullanilamaz

       // pers1.hemsireAdresi("Ankara");
        //pers1.hemsireIsmi("Yildiz Yildiz");
        System.out.println(pers1.getHastaneIsmi());// Yildiz hastanesi
        pers1.setHastaUcreti(500);
  //getter ve setter metodlari
// bazende erisimi sinirlandirmak icin degil
// kullanicilarin islevi iyi anlamasi icin kullanilir
        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("İstanbul");
        System.out.println(pers1.getHemsireIsmi());


    }





        }



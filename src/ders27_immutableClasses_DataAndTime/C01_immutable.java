package ders27_immutableClasses_DataAndTime;

public class  C01_immutable {


        public static void main(String[] args) {
            // Bu kod calistiginda Java kac obje olusturur ?
            String str= "Ali";
            for (int i = 0; i <10 ; i++) {
                str+=".";
            }
            System.out.println(str);//Ali..........cevap 11 olur
        }
    }


package ders32_inheritanceConstructorCall;

public class DCamary extends BToyota{


  DCamary (String pc){
      super("Deniz");
      System.out.println("String parametreli Camry");

  }

DCamary(){

}




    public static void main(String[] args) {
// eger kullanilan  argümente utgun bir
// contructor paren classda yoksa CTE olur

DCamary camry2=new DCamary( "celal");





        System.out.println("===========");
    DCamary camery1=new DCamary();
// parametresiz araba constructar
// parametresiz Toyota constructar

    }
}

package ders31_inheritance;

public class BinekArac  extends Arac{

   protected String marka="Binek araclarinin markasi vardir";

    protected String model="Binek araclarinin modeli olur";

protected  int yil=1990;

protected  void hiz(){
    System.out.println("Binek araclarin hizi modele göre degisir");

}

    @Override
    protected void teker() {
        System.out.println("binek aracilarin 4 tekeri olur");
    }
}

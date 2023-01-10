package ders11_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {
   // soru 6: kullanicidan isim ve soy ismini ayri ayri alin
   // isim daha uzun ise ,isim ve soysimi ilk harf büyük
   // kalanlar kücük sekliyle yazdirin
   // Soyisim daha uzun ise ilk harf büyük digerleri kücük//
    // sayisal büyük harflerle yazdirin


        String isim="MEHMet";
        String soyisim="HARuNGIL";
        String yeniIsimSoyisim;
        if (isim.length()>soyisim.length()){
            // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
            yeniIsimSoyisim= isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).toLowerCase();
        }else {
            // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
            yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.toUpperCase();
        }
             System.out.println(yeniIsimSoyisim);
    }
}









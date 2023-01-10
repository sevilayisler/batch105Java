package ders11_stringManipulation;

public class C04_replaceAll {

    public static void main(String[] args) {

  // Kullanicinin girdigi metinde harf disinda kalan tüm karakterleri
  // temizleyen bir kod yazin
  // NOT : Space silinmemeli

  String metin="Bas3arm9ak ic%in az:metmek one6mli";

metin=metin.replaceAll("\\d","");//rakamlari sildim
metin=metin.replace(" ","7"); // space yerine 7 var
                                             // Basarmak7ic%in7az:metmek7onemli

metin=metin.replaceAll("\\W","");
metin=metin.replace("7"," ");

        System.out.println(metin);







    }
}

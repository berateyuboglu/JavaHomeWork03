/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berat.homeworks.homework03;

/**
 *
 * @author 'Berat
 */
public class Student {
    String Adi,Soyadi,Okulu,Bolumu;
    int numarasi;
    
    
    public Student (String ad, String soyad, String okul,String bolum,int num){ // YAPICIMIZ
this.Adi = ad;     //Üye değişkenlerden verileri aldık
this.Soyadi = soyad; //Üye değişkenlerden verileri aldık
this.Okulu = okul;  //Üye değişkenlerden verileri aldık
this.Bolumu = bolum; //Üye değişkenlerden verileri aldık
this.numarasi = num;  //Üye değişkenlerden verileri aldık
    }
    
    
    public static void displayStudent(String ad, String soyad, String okul,String bolum,int num) { // Burası Birazcık uzun oldu fakat teker teker yazmaktansa tek metod ile hepsini yazdırmak mantıklı
       System.out.println("Adi:"+ad+" Soyadi:"+soyad+" Okulu:"+okul+" Bolumu:"+bolum+" Numarası:"+num); // Yaratılan nesneden değerleri ekrana basıyoruz
    }
    
     public static void main(String[] args) { // main metodumuz
         
         Student ogrenci1 = new Student("Berat","Eyuboglu","Okan Uni","Mobil TEK",55);
         Student ogrenci2 = new Student("Veli","Ali","Okan Uni","Mobil TEK",75);
      
        
         displayStudent(ogrenci1.Adi,ogrenci1.Soyadi,ogrenci1.Okulu,ogrenci1.Bolumu,ogrenci1.numarasi); // ogrenci1 nesnesini ekrana bastık
         displayStudent(ogrenci2.Adi,ogrenci2.Soyadi,ogrenci2.Okulu,ogrenci2.Bolumu,ogrenci2.numarasi); // ogrenci2 nesnesini ekrana bastık
         
         if (ogrenci1 == ogrenci2) { // Nesne karşılaştırması
         System.out.println("Eşit");
         }
         else {
         System.out.println("Eşit Değil");
         }
         
         
         //Berat Eyüpoğlu 
         
     }
    
}

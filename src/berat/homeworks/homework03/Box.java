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

public class Box {
    double height, width;

// Yapıcılar
public Box(double h, double w){ // çift parametreli yapıcı
this.height = h; // this Box 
this.width = w; // this Box
    }

public Box(double h){ // tep parametreli yapıcı
this.height = h; // this

    }
// Yapıcılar Son



public double getHeight() {
return height;
    }

public double getWidth() {
return width;
    
}

  public static void main(String[] args) {
   
    
    Box deger1 = new Box(10); // nesneyi tek parametre ile yarattım
    
    Box deger2 = new Box(10,11); // nesneyi çift parametre ile yarattım
    
    if (deger1 == deger2) {
    System.out.println("Nesneler Birbirini Doğruluyor");
    }
    else {
    System.out.println("Nesneler Birbirini Doğrulamıyor");
    }
    
    if (deger1.equals(deger2)) {
    System.out.println("İki nesne aynı");
    }
    else {
          System.out.println("İki nesne farklı");
        
    }
    
  
    
     
    


    
    
}


        }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insan;

/**
 *
 * @author BAYDIN
 */
public class İnsan {
    int boy;
    int kilo;
    int yas;
    void yemek(){
        kilo++;   
    }
    
   
    public static void main(String[] args) {
     
       Calisan ali = new Calisan(); 
       ali.boy= 180;
       ali.kilo=80;
       ali.yas=22;
       System.out.println("Alinin yaşı "+ali.yas+"Alinin kilosu "+ali.kilo+"Alinin boyu "+ali.boy);
       İnsan veli=new İnsan();
       veli.boy= 170;
       veli.kilo=70;
       veli.yas=23;
       System.out.println("Velinin yaşı "+veli.yas+"Velinin kilosu "+veli.kilo+"Velinin boyu "+veli.boy);
       ali.yemek();
       veli.yemek();
       System.out.println("Velinin yaşı "+veli.yas+"Velinin kilosu "+veli.kilo+"Velinin boyu "+veli.boy);
       ali.maas=100;
       ali.zam(20);
       System.out.println("Alinin zamlı maaşı "+ali.maas);
       ali.zam(30);
       System.out.println("Alinin zamlı maaşı "+ali.maas);       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarOOP;

/**
 *
 * @author Faris
 */
public class Polymorphism {
   class Sepeda {
       void merek() {
           System.out.println("Merek-merek Sepeda: ");
       } 
   }

   class Polygon extends Sepeda {
       @Override
       void merek() {
           System.out.println("Polygon");
       }
   }

   class Pacific extends Sepeda {
       @Override
       void merek() {
           System.out.println("Pacific");
       }
   }
   
}

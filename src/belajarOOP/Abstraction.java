/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarOOP;

/**
 *
 * @author Faris
 */
public class Abstraction {
    abstract class Sepeda {
        abstract void bergerak();  
    }

    class Bergerak extends Sepeda {
        @Override
        void bergerak() {

            System.out.println("Sepeda bergerak menggunakan 2 roda");
        }
    }

}

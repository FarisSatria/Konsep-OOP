/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarOOP;

/**
 *
 * @author Faris
 */
public class Inheritance {

    class Kendaraan {
        String bunyiBell() {
            return "kring kring";
        }
    }

    class Sepeda extends Kendaraan {
        void main(String[] args) {
            Sepeda s = new Sepeda();

            System.out.println("Bunyi bell sepeda: " + s.bunyiBell());
        }
    }


}


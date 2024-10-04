/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

import java.util.Scanner;

/**
 *
 * @author Faris
 */
public class Testing {

    /**
     * @return 
     */
    
    public static int userInput (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        return n;
    }
    
    public static void main(String[] args) {
        int n = userInput();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("  ");
            } 
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            } 
            for(int j = i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
}

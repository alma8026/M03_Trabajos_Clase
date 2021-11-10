/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, factorial=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número para ver su factorial: ");
        num = teclado.nextInt();
        int multi=1;
        
        for (multi=1; multi <= num; multi++){
           factorial = (factorial * multi);
        }
        
        System.out.println("Factorial: " + factorial);
        
        
    }
    
}

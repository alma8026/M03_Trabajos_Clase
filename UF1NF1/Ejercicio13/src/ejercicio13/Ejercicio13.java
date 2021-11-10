/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        
        if (num1>num2) {
            System.out.println("El orden es: " + num2 + " y " + num1);
        }
        else {
            System.out.println("El orden es: " + num1 + " y " + num2);
        }
    }
    
}

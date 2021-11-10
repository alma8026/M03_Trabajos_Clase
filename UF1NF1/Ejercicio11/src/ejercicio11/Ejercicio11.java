/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Escoge el segundo número: ");
        num2 = teclado.nextInt();
        
        if (num1>num2) {
                System.out.println("El número mayor es: " +  num1);
        }
        else {
                System.out.println("El número mayor es: " + num2);
        }
        
    }
    
}

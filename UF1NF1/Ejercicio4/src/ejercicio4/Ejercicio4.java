/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, suma, resta, division, producto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escoge el primer número:");
        num1 = teclado.nextDouble();
        System.out.println("Has escogido: " + num1);
        System.out.println("Escoge el segundo número:");
        num2 = teclado.nextDouble();
        System.out.println("Has escogido: " + num2);
        
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 / num2;
        producto = num1 * num2;
        
        System.out.println("La suma de los dos es: " + suma);
        System.out.println("La resta de los dos es: " + resta);
        System.out.println("La división de los dos es: " + division);
        System.out.println("El producto de los dos es: " + producto);
        
    }
    
}

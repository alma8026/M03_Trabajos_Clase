/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        num3 = teclado.nextInt();
        
        if (num1>num2 && num1>num3) {
            System.out.println("El número mayor es: " + num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("El número mayor es: " + num2);
        }
        else if (num2==num1){
            System.out.println("Los números: " + num2 + " y " + num1 + " son iguales.");
        }
        else {
            System.out.println("EL número mayor es: " + num3);
                }
    }
    
}

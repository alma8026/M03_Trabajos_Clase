/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomej.pkg2adivinarnum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RandomEj2AdivinarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        int num=0;
        int intentos=0;
        int numAleatorio = r.nextInt(50)+1;
        System.out.println("He pensado un número del 1 al 50.");
        
        while(num!=numAleatorio){
        System.out.println("Qué número es?");
        intentos++;
        num = teclado.nextInt();
        if (intentos==8){
            System.out.println("Has perdido :(");
            break;
        }
            System.out.println("Te quedan: " + (8-intentos) + " intentos.");
        if (num<numAleatorio){
            System.out.println("El número es mayor.");
        } else if (num>numAleatorio){
            System.out.println("El número es menor.");
        } else {
            System.out.println("Correcto :)");
            System.out.println("Lo has adivinado en " + intentos + " intentos.");
            System.out.println("El número es: " + numAleatorio);
        }
        }
        
        
        
    }
    
}

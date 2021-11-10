/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.pkg12_aelevadob;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej12_AelevadoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont, elevado=0, resultado=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = teclado.nextInt();
        System.out.println("Introduce por cuánto quieres elevarlo:");
        elevado = teclado.nextInt();
        
        
        for (cont=0; elevado!=cont; cont++){
            resultado = resultado * num;
        }
        System.out.println("El resultado es: " + resultado);
        
    }
    
}

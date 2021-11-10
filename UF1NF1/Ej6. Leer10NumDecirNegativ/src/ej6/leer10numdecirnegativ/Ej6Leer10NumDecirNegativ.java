/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.leer10numdecirnegativ;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej6Leer10NumDecirNegativ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont;
        boolean negativo;
        negativo = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 10 números: ");
        
        for (cont=1; cont <=10; cont++){
           num = teclado.nextInt();
           if (num<0){
               negativo = true;
           }
        }
        
        if (negativo == true){
            System.out.println("Has puesto un negativo.");
        } else {
            System.out.println("No has puesto un negativo.");
        }
        
        
    }
    
}

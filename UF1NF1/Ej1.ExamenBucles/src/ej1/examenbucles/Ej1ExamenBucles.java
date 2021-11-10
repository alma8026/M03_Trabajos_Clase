/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1.examenbucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej1ExamenBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont=0, cont2=0, num;
        int suma=0;
        while(cont!=3){
        System.out.print("|Pon un número: ");
        num = teclado.nextInt();
        if(num>=10 && num<=20){
            cont++;
            suma = suma + num;
        }
        cont2++;
        }
        
        System.out.println("Has introducido: " + cont2 + " números.");
        System.out.println("La suma de los 3 números es: " + suma);
    }
    
}

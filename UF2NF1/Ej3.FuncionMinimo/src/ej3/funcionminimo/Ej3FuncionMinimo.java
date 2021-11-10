/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.funcionminimo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej3FuncionMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, numMenor;
        System.out.print("Introduce el num1: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el num2: ");
        num2 = teclado.nextInt();
        
        numMenor = minimo(num1, num2);
        System.out.println("El número menor es: " + numMenor);
        
    }
    
    public static int minimo(int valor1, int valor2){
        if(valor1>=valor2){
            return valor2;
        }else {
            return valor1;
        }
    }
}

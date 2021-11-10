/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9.funcionesmayordetresvalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej9FuncionesMayorDeTresValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, numeroMayor;
        System.out.print("Introduce el num1: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el num2: ");
        num2 = teclado.nextInt();
        System.out.print("Introduce el num3: ");
        num3 = teclado.nextInt();
            
        numeroMayor = Mayor(num1, num2);
        numeroMayor = Mayor(numeroMayor, num3);
        
        System.out.println("El número mayor es: " + numeroMayor);
        
    }
    public static int Mayor(int valor1, int valor2){
        if(valor1>valor2){
            return valor1;
        }else{
            return valor2;
        }
    }
    
}

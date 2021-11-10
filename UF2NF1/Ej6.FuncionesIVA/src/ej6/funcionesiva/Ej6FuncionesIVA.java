/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.funcionesiva;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej6FuncionesIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, precioIVA;
        int cont=0;
        while(cont!=5){
        System.out.print("Introduce el precio: ");
        num = teclado.nextDouble();
        precioIVA = precioConIVA(num);
        System.out.println("Su precio con IVA es: " + precioIVA + " euros.");
        cont++;
        }
    }
    
    public static double precioConIVA(double valor1){
        double iva, precioFinal;
        iva = valor1 * 0.21;
        precioFinal = iva + valor1;
        return precioFinal;
    }
}

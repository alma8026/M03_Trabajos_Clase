/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.funciontablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej11FuncionTablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Que tabla de multiplicar quieres: ");
        tabla = teclado.nextInt();
        
        tablaMulti(tabla);
   
    }
    public static void tablaMulti(int tabla){
        int multi, cont=1;
        System.out.println("Tabla del " + tabla);
        do {
            multi = tabla * cont;
            System.out.println(tabla + " * " + cont + " = " + (multi));
            cont++;
        }while(cont<=10);
    }
}

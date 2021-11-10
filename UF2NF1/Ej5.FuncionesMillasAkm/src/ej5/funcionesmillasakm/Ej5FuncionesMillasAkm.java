/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.funcionesmillasakm;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej5FuncionesMillasAkm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, kilometros;
        System.out.print("Introduce un valor en millas: ");
        num = teclado.nextInt();
        
        kilometros = millas_a_kilometros((int) num);
        if(kilometros==-1){
            System.out.println("Valores introducidos en negativo.");
        }else{
            System.out.println(num + " millas son: " + kilometros + " Kilómetros.");
        }
    }
    
    public static double millas_a_kilometros(int valor1){
        double km; 
        if(valor1<0){
            return -1;
        }else{
            km = valor1 * 1.60934;
            return km;
        }
    }
}

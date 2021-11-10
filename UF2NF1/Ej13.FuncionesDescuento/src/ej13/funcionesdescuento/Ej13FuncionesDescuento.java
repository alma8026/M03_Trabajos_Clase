/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13.funcionesdescuento;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej13FuncionesDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sinDescuento, conDescuento, descuento;
        System.out.print("Introduce el precio sin descuento: ");
        sinDescuento = teclado.nextDouble();
        System.out.print("Introduce el precio con descuento: ");
        conDescuento = teclado.nextDouble();
        
        descuento = calcularDescuento(sinDescuento, conDescuento);
        System.out.println("El porcentaje de descuento es de: " + descuento + " %");
    }
    public static double calcularDescuento (double sinD, double conD){
        double descuento;
        descuento = (100 * sinD)/conD;
        descuento = 100 - descuento;
        return descuento;
    }
}

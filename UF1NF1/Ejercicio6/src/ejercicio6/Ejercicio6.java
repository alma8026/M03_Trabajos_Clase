/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precioArt, precioVenta;
        double descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el precio del artículo:");
        precioArt = teclado.nextInt();
        System.out.println("Has escogido: " + precioArt);
        
        System.out.println("Escoge el precio de venta:");
        precioVenta = teclado.nextInt();
        System.out.println("Has escogido: " + precioVenta);
        
        descuento = (double)((precioArt-precioVenta)*100)/precioArt;
        System.out.println("El descuento es de: " + descuento + "%");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorbitcoin;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConversorBitcoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double monedas, dineroEuros;
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("caca ");
        System.out.println("Cuántas monedas tienes? ");
        monedas = teclado.nextDouble();
        System.out.println("|Elige si quieres convertir Bitcoins o XMR:");
        System.out.println("|1. Bitcoin a euros.|");
        System.out.println("|2. XMR a euros.    |");
        System.out.print("Elige 1 o 2: ");
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1: //Conversor de Bitcoin a euro
                dineroEuros = monedas * 49561;
                break;
            case 2: //Conversor de XMR a euro
                dineroEuros = monedas * 233.81;
                break;
            default: //Opción de error por si acaso
                dineroEuros= 0;
                System.out.println("Opción errónea, por favor intente de nuevo.");
                break;
        }
        
        System.out.println("Tienes: " + dineroEuros + " euros");
    }
    
}

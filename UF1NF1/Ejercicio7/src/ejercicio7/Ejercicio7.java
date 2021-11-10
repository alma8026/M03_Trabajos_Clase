/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valormillas, valormetros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de millas:");
        valormillas = teclado.nextDouble();
        System.out.println("Has escogido: " + valormillas);
        
        valormetros = (double) valormillas * 1852;
        System.out.println("EL valor en metros es: " + valormetros);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        double longitud;
        double volumen;
        double area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el radio:");
        radio = teclado.nextDouble();
        System.out.println("Has escogido: " + radio);
        //cálculos
        longitud = 2 * 3.14 * radio;
        volumen = 4/3 * 3.14 * (radio * radio * radio);
        area = 3.14 * radio * radio;
        //mostrar al usuario
        System.out.println("La longitud es: " +  longitud);
        System.out.println("El volumen es: " + volumen);
        System.out.println("El área es: " + area);
        
    }
    
}

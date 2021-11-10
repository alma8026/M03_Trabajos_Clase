/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nota: ");
        nota = teclado.nextDouble();

        if (3 >= nota) {
            System.out.println("Tú nota es Muy Deficiente");
        } else if (nota < 5 && nota >= 3) {
            System.out.println("Tú nota es Insuficiente");
        } else if (nota <= 6 && nota >= 5) {
            System.out.println("Tú nota es un Bien");
        } else if (nota <= 9 && nota > 6) {
            System.out.println("Tú nota es Notable");
        } else if (nota >9 && nota <=10) {
            System.out.println("Tú nota es Sobresaliente");
        } else {
            System.out.println("La nota debe ser de 0 a 10.");
        }

    }

}

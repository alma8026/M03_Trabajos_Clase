/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.pkg13_adivinarnum;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej13_AdivinarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numAdivina, minimo = 1, maximo = 100;
        Scanner teclado = new Scanner(System.in);
        char respuesta;

        do {
            numAdivina = (minimo + maximo) / 2;
            System.out.println("Tú número es el " + numAdivina + "?");
            System.out.println("Mayor (M), inFerior(F), Igual(I)");
            respuesta = teclado.nextLine().charAt(0);
            if (respuesta == 'M' || respuesta == 'm') {
                minimo = numAdivina;
            } else if (respuesta == 'F' || respuesta == 'f') {
                maximo = numAdivina;
            }
        } while (respuesta != 'I' && respuesta != 'i');

        System.out.println("Tu número es el: " + numAdivina);

    }

}

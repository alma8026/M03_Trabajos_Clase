/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.pkg10_0.pkg10notas;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej10_010notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota = 0, sumanotas = 0, notamediaFinal = 0;
        int cont;
        boolean hubo10 = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las notas:");

        for (cont = 0; nota != -1; cont++) {
            nota = teclado.nextInt();
            if (nota > 10) {
                System.out.println("Introduzca de nuevo (del 0 al 10)");
                cont = cont - 1;
            }
            if (nota == 10) {
                hubo10 = true;
            }
            if (nota != -1 && nota<=10) {
                sumanotas = sumanotas + nota;
            }
        }
        cont = cont - 1;//-1 para que no cuente cuando finalice el programa
        notamediaFinal = sumanotas / cont;
        System.out.println("La nota media es: " + notamediaFinal);
        System.out.println("Has puesto: " + cont + " notas.");
        if (hubo10 == true) {
            System.out.println("Sí hay algún 10.");
        } else {
            System.out.println("No ha habido ningún 10.");
        }
    }

}

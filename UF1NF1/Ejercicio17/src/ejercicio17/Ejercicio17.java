/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, minutos, segundos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la hora expresada en horas, minutos y segundos: ");
        System.out.println("Horas: ");
        horas = teclado.nextInt();
        System.out.println("Minutos: ");
        minutos = teclado.nextInt();
        System.out.println("Segundos: ");
        segundos = teclado.nextInt();

        if (segundos == 59) {
            segundos = 0;
            if (minutos == 59) {
                minutos = 0;
                if (horas == 23) {
                    horas = 0;
                } else {
                    horas = horas + 1;
                }
            } else {
                minutos = minutos + 1;
            }
        } else {
            segundos = segundos + 1;
        }

        System.out.println("Transcurrido un segundo será: " + horas + " horas "
                + minutos + " minutos y " + segundos + " segundos.");
    }

}

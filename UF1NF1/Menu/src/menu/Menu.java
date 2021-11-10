/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        final int OPCION1;
        final int OPCION2;
        final int OPCION3;
        final int OPCION4;
        Scanner teclado = new Scanner(System.in);
        System.out.println("        Menú de juego");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
        System.out.println("|1- Jugar nueva partida     |");
        System.out.println("|2- Cargar partida guardada |");
        System.out.println("|3- Ver records             |");
        System.out.println("|4- Salir                   |");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
        System.out.println("Escoge opción(1, 2, 3 o 4):");
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Empezando nueva partida...");
                break;
            case 2:
                System.out.println("Cargando partida....");
                break;
            case 3:
                System.out.println("Tus records son: 1h, 34 min y 20 seg");
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
        
    }
    
}

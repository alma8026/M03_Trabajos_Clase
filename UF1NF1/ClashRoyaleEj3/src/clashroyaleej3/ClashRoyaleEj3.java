/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleej3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashRoyaleEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char eleccion;
        int copas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántas copas tienes?");
        copas = teclado.nextInt();
        teclado.nextLine();

        if (copas > 3000) {
            System.out.println("Escoge entre Ejército de Esqueletos(e) o Gigante(g)");
            eleccion = teclado.nextLine().charAt(0);
            if (eleccion == 'e' || eleccion == 'E') {
                System.out.println("Has escogido: Ejército de Esqueletos");
            } else if (eleccion == 'g' || eleccion == 'G') {
                System.out.println("Has escogido: Gigante");
            } else {
                System.out.println("Opción Incorrecta");
            }
        } else {

            if (copas < 2000) {
                System.out.println("Escoge entre Mago Eléctrico(m) o Esbirro Mega(e)");
                eleccion = teclado.nextLine().charAt(0);
                if (eleccion == 'm' || eleccion == 'M') {
                    System.out.println("Has escogido: Mago Eléctrico");
                } else if (eleccion == 'e' || eleccion == 'E') {
                    System.out.println("Has escogido: Esbirro Mega");
                } else {
                    System.out.println("Opción Incorrecta");
                }
            } else {
                System.out.println("Escoge entre Caballero(c) o Bandida(b)");
                eleccion = teclado.nextLine().charAt(0);
                if (eleccion == 'c' || eleccion == 'C') {
                    System.out.println("Has escogido: Caballero");
                } else if (eleccion == 'b' || eleccion == 'B') {
                    System.out.println("Has escogido: Bandida");
                } else {
                    System.out.println("Opción Incorrecta");
                }
            }
        }

    }

}

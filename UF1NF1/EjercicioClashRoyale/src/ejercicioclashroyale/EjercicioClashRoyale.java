/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclashroyale;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int eleccion;
        int copas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántas copas tienes?");
        copas = teclado.nextInt();
        
        if(copas<2000){
        System.out.println("Escoge entre Mago Eléctrico(0) o Esbirro Mega(1)");
        eleccion = teclado.nextInt();
            if (eleccion==0) {
            System.out.println("Has escogido: Mago Eléctrico");
            } else if (eleccion==1) {
            System.out.println("Has escogido: Esbirro Mega");
            } else {
                System.out.println("Opción Incorrecta");
            }
        } else {
            System.out.println("Escoge entre Caballero(0) o Bandida(1)");
        eleccion = teclado.nextInt();
            if (eleccion==0) {
            System.out.println("Has escogido: Caballero");
            } else if (eleccion==1) {
            System.out.println("Has escogido: Bandida");
            } else {
                System.out.println("Opción Incorrecta");
            }
        } 
        
        
        
        
    }
    
}

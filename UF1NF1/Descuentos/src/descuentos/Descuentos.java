/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Descuentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double importe, descuento, importeFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el importe gastado: ");
        importe = teclado.nextInt();
        
        if (importe<800) {
            importeFinal = importe;
            System.out.println("El descuento será de 0€ y el precio final de " + importeFinal + "€");
        } else if (importe>=800 && importe<1500) {
            descuento = importe * 6/100;
            importeFinal = importe - descuento;
            System.out.println("El descuento será de " + descuento + "€ y el precio final de " + importeFinal + "€");
        } else if (importe>=1500 && importe<3000) {
            descuento = importe * 8/100;
            importeFinal = importe - descuento;
            System.out.println("El descuento será de " + descuento + "€ y el precio final de " + importeFinal + "€");
        } else if (importe>=3000) {
            descuento = importe * 10/100;
            importeFinal = importe - descuento;
            System.out.println("El descuento será de " + descuento + "€ y el precio final de " + importeFinal + "€");
        } else {
            System.out.println("Datos erróneos, por favor, introduzca de nuevo");
        }
    }
    
}

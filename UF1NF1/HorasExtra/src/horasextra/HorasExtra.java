/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horasextra;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HorasExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horasExtra, dineroExtra;
        double sueldo, dineroTotal;
        int categoria;
        final int PREU_HORA_CATEGORIA1 = 30;
        final int PREU_HORA_CATEGORIA2 = 35;
        final int PREU_HORA_CATEGORIA3 = 40;
        final int PREU_HORA_CATEGORIA4 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quin es el teu sou base?");
        sueldo = teclado.nextDouble();
        System.out.println("Quantes hores extra has fet?");
        horasExtra = teclado.nextInt();
        System.out.println("Quina categoria tens?");
        categoria = teclado.nextInt();
        
        switch (categoria) {
            case 1:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA1;
                break;
            case 2:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA2;
                break;
            case 3:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA3;
                break;
            default:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA4;
                break;
        }
        
        dineroTotal = sueldo + dineroExtra;
        System.out.println("Este mes vas a cobrar: " + dineroTotal);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, tabla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que tabla de multiplicar quieres:");
        tabla = teclado.nextInt();
        System.out.println("Tabla del " + tabla + " (for)");
        for (cont = 1; cont <= 10; cont++) {
            System.out.println(tabla + " * " + cont + " = " + (tabla*cont));
        }
        
        System.out.println("Tabla del " + tabla + " (while)");
        cont=1;
        int multi;
        while(cont<=10) {
            multi = tabla * cont;
            System.out.println(tabla + " * " + cont + " = " + (multi));
            cont=cont+1;
        }
        
        System.out.println("Tabla del " + tabla + " (do)");
        cont=1;
        do {
            multi = tabla * cont;
            System.out.println(tabla + " * " + cont + " = " + (multi));
            cont=cont+1;
        }while(cont<=10);
        
        
        
    }
    
}

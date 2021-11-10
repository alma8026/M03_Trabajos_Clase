/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticiones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Repeticiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        
        System.out.println("FOR:");
        for (cont = 0; cont < 6; cont++) {
            System.out.println("numero " + cont);
        }
        
        System.out.println("WHILE:");
        cont=0;
        while (cont<=5) {
        System.out.println("numero " + cont);
        cont = cont + 1;
        }
        
        System.out.println("DO WHILE:");
        cont = 0;
        do{
            System.out.println("numero " + cont);
            cont++;
        }while (cont<6);
        
        
        
        
        
        
    }
    
}

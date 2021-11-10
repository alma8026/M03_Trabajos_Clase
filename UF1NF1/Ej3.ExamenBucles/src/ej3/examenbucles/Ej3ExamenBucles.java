/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.examenbucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej3ExamenBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char respuesta='a';
        int metros, sumaMetros=0;
        boolean error = false;
        while(respuesta!='n' && respuesta!='N'){
            System.out.print("Metros cuadrados habitación: ");
            metros = teclado.nextInt();
            if(metros<0){
                error = true;
                break;
            }
            teclado.nextLine();
            sumaMetros = sumaMetros + metros;
            System.out.print("Hay más habitaciones?(s/n): ");
            respuesta = teclado.nextLine().charAt(0);
        }
        if(error==false){
            System.out.println("Tú casa mide " + sumaMetros + " metros cuadrados.");
        }else {
            System.out.println("Error, valores introducidos en negativo.");
        }
    }
    
}

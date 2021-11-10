/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recogerletraporteclado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RecogerLetraPorTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double edad;
        /* Sirve para recoger datos por teclado y lo devuelve */
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Eres mayor de edad?(s/n)");
        char mayorEdad;
        int dinero;
        //recoge la frase que pongas pero devuelve la letra 
        //que esta en la primera posición
        
        mayorEdad = teclado.nextLine().charAt(0);
        System.out.println("Has escogido " + mayorEdad);
        System.out.println("¿Cuánto dinero tienes?");
        dinero = teclado.nextInt();
        // or se escribe = ||
        // and se escribe &&
        
        if ((mayorEdad == 's') || (mayorEdad == 'S') && (dinero>=10)){
            System.out.println("¿Cuál es el café más peligroso del mundo?"
                    + "El ex-preso.");
        }
        else if ((mayorEdad == 'n') || (mayorEdad == 'N')) {
            System.out.println("caca culo pedo pis jaja");
        }
        else {
            System.out.println("Error, escoge 's' o 'n'");
        }
        
        
    }
    
}

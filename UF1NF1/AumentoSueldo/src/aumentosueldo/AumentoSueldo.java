/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aumentosueldo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AumentoSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double sueldo, incremento, sueldoFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu sueldo: ");
        sueldo = teclado.nextInt();
        
        if (sueldo<18000) {
            incremento = sueldo * 12/100;
            sueldoFinal = sueldo + incremento;
            System.out.println("El aumento de sueldo será de " + incremento + "€ y el sueldo final de " + sueldoFinal + "€");
        } else if (sueldo<=18000 && sueldo<30000) {
            incremento = sueldo * 10/100;
            sueldoFinal = sueldo + incremento;
            System.out.println("El aumento de sueldo será de " + incremento + "€ y el sueldo final de " + sueldoFinal + "€");
        } else if (sueldo>=30000 && sueldo<45000) {
            incremento = sueldo * 8/100;
            sueldoFinal = sueldo + incremento;
            System.out.println("El aumento de sueldo será de " + incremento + "€ y el sueldo final de " + sueldoFinal + "€");
        } else if (sueldo>=45000) {
            incremento = sueldo * 6/100;
            sueldoFinal = sueldo + incremento;
            System.out.println("El aumento de sueldo será de " + incremento + "€ y el sueldo final de " + sueldoFinal + "€");
        } else {
            System.out.println("Datos erróneos, por favor, introduzca de nuevo");
        }
        
        
        
        
        
    }
    
}

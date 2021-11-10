/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocermayorfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConocerMayorFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor1, valor2;
        System.out.println("Pon el valor 1: ");
        valor1 = teclado.nextInt();
        System.out.println("Pon el valor 2: ");
        valor2 = teclado.nextInt();
        
        int numeromayor = numeroMasGrande(valor1, valor2);
        
        System.out.println("El número más grande es: " + numeromayor);
        
    }
    /**
     * Función que retorna el valor mayor
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int numeroMasGrande(int valor1, int valor2)
    {
        
        if(valor1>=valor2){
            return valor1;   
        }else {
            return valor2;
        }
        
    }
    
}

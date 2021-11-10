/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesdevuelvevalor;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionesDevuelveValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon un valor y lo doblaré por 2, el resultado, lo multiplicaré por 3.");
        int numero = teclado.nextInt();
        int ValorDoble = doblarNumero(numero);
        int ValorTriple = TriplicarNumero(ValorDoble);
        System.out.println("Número: " + numero + "| ValorDoble: " + ValorDoble);
        System.out.println("Número: " + ValorDoble + "| ValorTriple: " + ValorTriple);
        
        
    }
    /**
     * Función que duplica un valor
     * @param valor de entrada que será duplicado
     * @return el doble del valor de entrada
     */
    public static int doblarNumero(int valor)
    {
       int doble = valor*2;
       return doble;
        
    }
    /**
     * Función que triplica un valor
     * @param valor de entrada que será triplicado
     * @return el triple del valor de entrada
     */
    public static int TriplicarNumero(int valor)
    {
       int triple = valor*3;
       return triple;
        
    }
    
}

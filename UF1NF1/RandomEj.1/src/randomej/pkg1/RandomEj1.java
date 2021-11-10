/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomej.pkg1;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class RandomEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int numAleatorio = r.nextInt(20)+21;//el +21 es el minimo y el 20 la cantidad de numeros desde 21
        System.out.println("Número aleatorio: " + numAleatorio);
        
        
        
    }
    
}

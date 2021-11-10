/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaproducto10num;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SumaProducto10Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=1, suma10=0, producto10=1;
        
        for (numero=1; numero <=10; numero++){
            suma10 = suma10 + numero;
            producto10 = producto10 * numero;
        }
        System.out.println("La suma total es: " + suma10);
        System.out.println("El producto total es: " + producto10);
        
    }
    
}

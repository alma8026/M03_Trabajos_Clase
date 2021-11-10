/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numdel1hastan;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NumDel1HastaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=1, fin;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge hasta que número se mostrará:");
        fin = teclado.nextInt();
        
        while(num<=fin){
            System.out.println("Número " + num);
            num = num + 1;
    }
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroparoimpar;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NumeroParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=|");
        System.out.println("|Introduce un número: |");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=|");
        num = teclado.nextInt();
        
        
        if(num%2==0){
            if(num%3==0){
                System.out.println("Número par y divisible entre 3. (" + num + ")");
            }else {
                System.out.println("Número par. (" + num + ")");
            }
        }else {
            System.out.println("Número impar. (" + num + ")");
        }
  
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedirnumerohasta0;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PedirNumeroHasta0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, acumulandoSuma=0;
        Scanner teclado = new Scanner(System.in);
        
//        do {
//            System.out.print("Escribe un número: ");
//            num = teclado.nextInt();
//            if(num!=-1){
//                acumulandoSuma = acumulandoSuma + num;
//                System.out.println("El acumulado es: " + acumulandoSuma);
//            }
//        }while(num!=-1);
//        System.out.println("Has escrito -1 se termina el programa.");
//        System.out.println("El total es: " + acumulandoSuma);
        boolean finalBucle = false;
        
        do {
            System.out.print("Escribe un número hasta sumar 100 (no negativos o 0): ");
            num = teclado.nextInt();
            if (num>0){
            acumulandoSuma = acumulandoSuma + num;
            System.out.println("El acumulado es: " + acumulandoSuma);
            }else {
                System.out.println("Número 0 o negativo no se suma");
            }
            if(acumulandoSuma>=100){
                finalBucle=true;
            }
        }while(!finalBucle);
        System.out.println("Has llegado a más de 100, se termina el programa.");
        System.out.println("El total es: " + acumulandoSuma);


        
    }
    
}

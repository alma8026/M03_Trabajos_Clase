/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17.funcionesnumhasta0;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej17FuncionesNumHasta0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=1;
        boolean primo;
        do{
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            if(num!=0){
            primo = numeroPrimo(num);
            if(primo == true){
                System.out.println("El número es primo.");
            }else{
                System.out.println("El número no es primo.");
            }
            }
        }while(num!=0);
    }
    public static boolean numeroPrimo(double num){
        for (int cont=2; cont<=num -1;cont++){
            if(num%cont==0){
                return false;
            }
        }
        return true;
        }
        
    }
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.funcionespositivonegativo0;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej4FuncionesPositivoNegativo0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, valor;
        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        valor = dimeSigno(num);
        System.out.println(valor);
    }
    
    public static int dimeSigno(int valor1){
        if(valor1<0){
            return -1;
        }else if (valor1==0){
            return 0;
        }else {
            return 1;
        }
    }
}

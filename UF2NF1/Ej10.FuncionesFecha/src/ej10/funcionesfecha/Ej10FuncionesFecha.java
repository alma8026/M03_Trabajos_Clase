/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.funcionesfecha;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej10FuncionesFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        boolean correcto;
        System.out.print("Introduce el día: ");
        dia = teclado.nextInt();
        System.out.print("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.print("Introduce el año: ");
        año = teclado.nextInt();
        correcto = funcionCorrecto(dia, mes, año);
        
        if(correcto==true){
            System.out.println("Los datos son correctos.");
        }else{
            System.out.println("Los datos son falsos.");
        }
    }
    public static boolean funcionCorrecto(int valor1, int valor2, int valor3){
        boolean correcto;
        if (valor1<=30 && valor1>0 && valor2<=12 && valor2>0 && valor3>0){
            correcto = true;
        }else{
            correcto = false;
        }
        return correcto;
    }
    
}

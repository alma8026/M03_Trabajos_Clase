/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8.funcionessumayproducto;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej8FuncionesSumaYProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, resultadoSuma, resultadoProducto;
        double resultadoMedio;
        System.out.print("Introduce un número(1-10): ");
        num = teclado.nextInt();
        if(num>10 || num<=0){
            System.out.println("Introduce un número entre 1 y 10.");
        }else{
        resultadoSuma = suma1aN(num);
        resultadoProducto = producto1aN(num);
        resultadoMedio = intermedio1aN(num);
        System.out.println("La suma: " + resultadoSuma);
        System.out.println("El producto es: " + resultadoProducto);
        System.out.println("El número intermedio es: " + resultadoMedio);
        }
    }
    
    public static int suma1aN(int valor1){
        int cont=1, num=1, resultado=valor1;
        while (cont!=valor1){
            resultado = resultado + num;
            cont++;
            num++;
        }
        return resultado;
    }
    public static int producto1aN(int valor1){
        int cont=1, num=1, resultado=valor1;
        while (cont!=valor1){
            resultado = resultado * num;
            cont++;
            num++;
        }
        return resultado;
    }
    public static double intermedio1aN(double valor1){
        double medio;
        medio = valor1/2;
        return medio;
    }
}

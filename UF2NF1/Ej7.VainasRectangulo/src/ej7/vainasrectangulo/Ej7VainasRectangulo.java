/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7.vainasrectangulo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej7VainasRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ancho, alto, areaRecta, perimetroRecta;
        System.out.print("Introduce el ancho del rectángulo: ");
        ancho = teclado.nextDouble();
        System.out.print("Introduce el alto del rectángulo: ");
        alto = teclado.nextDouble();
        
        perimetroRecta = perimetroRectangulo(ancho, alto);
        areaRecta = areaRectangulo(ancho, alto);
        
        System.out.println("El perimetro del rectángulo es: " + perimetroRecta);
        System.out.println("El área del rectángulo es: " + areaRecta);
    }
    
    public static double perimetroRectangulo(double ancho, double alto){
        double peri;
        peri = ancho + ancho + alto + alto;
        return peri;
    }
    public static double areaRectangulo(double ancho, double alto){
        double area;
        area = ancho * alto;
        return area;
    }
}

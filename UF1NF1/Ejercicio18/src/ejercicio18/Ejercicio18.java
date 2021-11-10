/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int horas, tarifa;
    double dineroConImpuestos, sueldoNeto, sueldoBruto, sueldoHorasNormales, sueldoHorasExtra, horaExtra;
    double dineroImpuestosMaximos, impuestos, impuestos900;
    Scanner teclado = new Scanner(System.in); 
        System.out.println("Introduce precio hora: ");
        tarifa = teclado.nextInt();
        System.out.println("Introduce horas trabajadas: ");
        horas = teclado.nextInt();
        
        
        if (horas<35) {
        sueldoBruto = tarifa * horas;
        System.out.println("Tu sueldo bruto es: " + sueldoBruto);
        } else {
            sueldoHorasNormales = 35 * tarifa;
            horaExtra = horas -35;
            sueldoHorasExtra = horaExtra*tarifa*1.5;
            sueldoBruto = sueldoHorasExtra + sueldoHorasNormales;
            System.out.println("Tu sueldo bruto es: " + sueldoBruto);
        }
        
        //impuestos
        if (sueldoBruto<500) {
        impuestos = 0;
        } else if (sueldoBruto<900) {
            dineroConImpuestos = sueldoBruto - 500;
            impuestos = dineroConImpuestos * 25/100;
        } else { // el sueldo bruto es más de 900
            dineroConImpuestos = 400;
            impuestos = dineroConImpuestos * 25/100;
            dineroImpuestosMaximos = sueldoBruto - 900;
            impuestos900 = dineroImpuestosMaximos*45/100;
            impuestos = impuestos + impuestos900;
        }
        
        System.out.println("Impuestos son: " + impuestos);
        sueldoNeto = sueldoBruto - impuestos;
        System.out.println("Tu sueldo neto es: " + sueldoNeto);
        
        
        
    }  
     
    
 }

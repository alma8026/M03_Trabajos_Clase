/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesrestasuma;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionesRestaSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, numeroSuma, numeroResta, numeroMulti;
        double numeroDivi, resultadoDivi;
        int resultado; //operacion 
        int opcion;
        valor1 = introducirPositivo(teclado);
        valor2 = introducirPositivo(teclado);
        mostrarMenu();
        opcion = validarOpcion();
        
        switch (opcion) {
            case 1:
                numeroSuma = SumaNumero(valor1, valor2);
                resultado = numeroSuma;
                System.out.println("La suma de los dos números es: " + resultado);
                break;
            case 2:
                numeroResta = RestaNumero(valor1, valor2);
                resultado = numeroResta;
                System.out.println("La resta de los dos números es: " + resultado);
                break;
            case 3:
                numeroMulti = MultiNumero(valor1, valor2);
                resultado = numeroMulti;
                System.out.println("La multiplicación de los dos números es: " + resultado);
                break;
            case 4:
                numeroDivi = DiviNumero(valor1, valor2);
                resultadoDivi = numeroDivi;
                System.out.println("La división de los dos números es: " + resultadoDivi);
                break;
            default:
                System.out.println("Introduzca de nuevo por favor.");
                break;
        }
        
    }
    /**
     * Función para sumar valor1 y valor2
     * @param valor1
     * @param valor2
     * @return devuelve la suma de los dos
     */
    public static int SumaNumero(int valor1, int valor2){
        int suma;
        suma = valor1 + valor2;
        return suma;
    }
    /**
     * Función para restar valor1 y valor2
     * @param valor1
     * @param valor2
     * @return devuelve la resta de los dos
     */
    public static int RestaNumero(int valor1, int valor2){
        int resta;
        resta = valor1 - valor2;
        return resta;
    }
    
    public static int MultiNumero(int valor1, int valor2){
        int multi;
        multi = valor1 * valor2;
        return multi;
    }
    
    public static double DiviNumero(int valor1, int valor2){
        double divi;
        divi = valor1 / valor2;
        return divi;
    }
    
    public static void mostrarMenu(){
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.println("3.- Calcular multiplicación");
        System.out.println("4.- Calcular división");
    }
    
    public static int validarOpcion(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
        System.out.print("Pon opcion (1, 2, 3 o 4): ");
        opcion = teclado.nextInt();
        if(opcion<1 || opcion>4){
            System.out.println("Opción incorrecta, introduzca de nuevo.");
        }
        }while(opcion<1 || opcion>4);
        return opcion;
    }
    public static int introducirPositivo(Scanner teclado){
        int opcion;
        do{
        System.out.println("Introduce un número positivo:");
        opcion = teclado.nextInt();
        if(opcion<0){
            System.out.println("Opción incorrecta, introduzca números positivos.");
        }
        }while(opcion<0);
        return opcion;
    }
}

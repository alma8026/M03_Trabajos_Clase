/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionmayoredad;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionMayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        edad = introducirPositivo(teclado);
        boolean mayorEdad = esMayorEdad(edad);
        if(mayorEdad==true){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Eres menor de edad.");
        }
    }
    public static int introducirPositivo(Scanner teclado){
        int opcion;
        do{
        System.out.println("Introduce tu edad:");
        opcion = teclado.nextInt();
        if(opcion<=0){
            System.out.println("Opción incorrecta, introduzca números positivos.");
        }
        }while(opcion<=0);
        return opcion;
    }
    public static boolean esMayorEdad(int edad){
        if(edad>=18){
            return true;
        }else {
            return false;
        }
    }
    
}

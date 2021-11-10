/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.pkg11_sumaparimpar;

/**
 *
 * @author alumne
 */
public class Ej11_sumaParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, sumaimpar=0, sumapar=0;
        
        for (cont=100; cont<=200; cont++){
            if (cont%2==0){
                sumapar = sumapar + cont;
            }else if (cont%2!=0){
                sumaimpar = sumaimpar + cont;
            }
        }
        System.out.println("Suma impares: " + sumaimpar);
        System.out.println("Suma pares: " + sumapar);
        
    }
    
}

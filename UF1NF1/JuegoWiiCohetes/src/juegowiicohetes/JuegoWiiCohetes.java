/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegowiicohetes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JuegoWiiCohetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        int cohete1 = r.nextInt(21);
        int cohete2 = r.nextInt(21);
        int cohete3 = r.nextInt(21);
        System.out.print("Escoge un cohete (1, 2 o 3): ");
        eleccion = teclado.nextInt();
        int lineaPintada=0;
        System.out.println("P1   P2   P3   ");
        while(lineaPintada<cohete1 || lineaPintada<cohete2 || lineaPintada<cohete3){
            if(lineaPintada<cohete1){
                System.out.print("*    ");
            }else {
                System.out.print("     ");
            }
            if(lineaPintada<cohete2){
                System.out.print("*    ");
            }else {
                System.out.print("     ");
            }
            if(lineaPintada<cohete3){
                System.out.println("*    ");
            }else {
                System.out.println("     ");
            }
            Thread.sleep(500);
            lineaPintada++;
        }
        
        
        if (cohete1>=cohete2 && cohete1>=cohete3){
            if(eleccion==1){
                System.out.println("Eres el ganador. Tu cohete ha llegado hasta " + cohete1 + " metros.");
            }else {
                System.out.println("Has perdido.");
            }
        }else if (cohete2>=cohete1 && cohete2>=cohete3){
            if(eleccion==2){
                System.out.println("Eres el ganador. Tu cohete ha llegado hasta " + cohete2 + " metros.");
            }else {
                System.out.println("Has perdido.");
            }
        }else {
            if(eleccion==3){
                System.out.println("Eres el ganador. Tu cohete ha llegado hasta " + cohete3 + " metros.");
            }else {
                System.out.println("Has perdido.");
            }
        }
        System.out.println("Cohete1: " + cohete1 + " metros.");
        System.out.println("Cohete2: " + cohete2 + " metros.");
        System.out.println("Cohete3: " + cohete3 + " metros.");
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleatacartorre;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashRoyaleAtacarTorre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int nivelLeñador=0;
        int ataque=0;
        int dañoTorre=0;
        int nivelTorre=0;
        int vidaTorre=0;
        int vidaLeñador=0;
        int golpes=0;
        
        System.out.println("A que nivel tienes el Leñador?");
        nivelLeñador = teclado.nextInt();
        System.out.println("Y el nivel de la torre?");
        nivelTorre = teclado.nextInt();
        
        if(nivelLeñador==9){
            ataque = 200;
            vidaLeñador=1060;
        }else if (nivelLeñador==10){
            ataque = 220;
            vidaLeñador=1166;
        }else if (nivelLeñador==11){
            ataque = 242;
            vidaLeñador=1282;
        }else if (nivelLeñador==12){
            ataque = 266;
            vidaLeñador=1409;
        }else if (nivelLeñador==13){
            ataque = 292;
            vidaLeñador=1547;
        }else {
            System.out.println("Respuesta solo del 9 al 13.");
            ataque = 0;
            vidaLeñador=0;
        }
        if(nivelTorre==9){
            vidaTorre = 2534;
            dañoTorre=90;
        }else if (nivelTorre==10){
            vidaTorre = 2786;
            dañoTorre=99;
        }else if (nivelTorre==11){
            vidaTorre = 3052;
            dañoTorre=109;
        }else if (nivelTorre==12){
            vidaTorre = 3346;
            dañoTorre=119;
        }else if (nivelTorre==13){
            vidaTorre = 3668;
            dañoTorre=131;
        }else {
            System.out.println("Respuesta solo del 9 al 13.");
            vidaTorre = 0;
            dañoTorre=0;
        }
        
        while(vidaTorre>0 && vidaLeñador>0){
            golpes++;
            System.out.println("Leñador atacó con " + ataque + " de fuerza.");
            vidaTorre = vidaTorre - ataque;
            if (vidaTorre<0){
                vidaTorre=0;
                System.out.println("Torre destruida.");
                break;
            }
            System.out.println("A la torre le queda: " + vidaTorre + " de vida.");
            Thread.sleep(500);
            System.out.println("Torre ataca a Leñador con " + dañoTorre + " de daño."); 
            vidaLeñador = vidaLeñador - (dañoTorre*2);
            if (vidaLeñador<0){
                vidaLeñador=0;
                System.out.println("Leñador derrotado.");
                break;
            }
            System.out.println("Leñador a " + vidaLeñador + " de vida.");
            Thread.sleep(500);
        }
        
        if (vidaLeñador==0){
            System.out.println("El ganador es la Torre.");
        }else {
            System.out.println("El ganador es el Leñador.");
        }
        System.out.println("Ha hecho " + golpes + " golpes.");
        
    }
    
}

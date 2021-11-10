/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jueguitominecraft;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JueguitoMInecraft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        char respuestaFinal;
        int finalizarJuego=2;
        int vidaJugador;
        int vidaZombie=0;
        int golpes=0;
        int dañoZombie;
        int dañoEspada;
        int itemsZombie;
        int carnePodrida;
        int carnePodridaFinal=0;
        int hierro=0;
        char dificultad;
        
        while (finalizarJuego==2){
            vidaJugador=20;
            System.out.println("MINECRAFT");
            System.out.println("Objetivo: 😈 Matar al Zombie 😈");
            System.out.println("Elige dificultad del juego (Fácil (f), Normal(n) o Difícil(d))");
            
            dificultad = teclado.nextLine().charAt(0);
              
        switch (dificultad) {
            case 'f':
            case 'F':
                dañoZombie=2;
                vidaZombie=15;
                break;
            case 'n':
            case 'N':
                dañoZombie=3;
                vidaZombie=20;
                break;
            case 'd':
            case 'D':
                dañoZombie=4;
                vidaZombie=25;
                break;
            default:
                System.out.println("Error, repita de nuevo por favor.");
                dañoZombie=0;
                break;
        }
        
        System.out.println("Dependiendo de tu suerte, tendrás una espada más o menos fuerte :D");
        int numEspada = r.nextInt(101);
        Thread.sleep(1000);
        if(numEspada>0 && numEspada<=25){
            System.out.println("Tu espada es de madera. (4 de daño)");
            dañoEspada = 4;
        }else if(numEspada>25 && numEspada<=50){
            System.out.println("Tu espada es de piedra. (5 de daño)");
            dañoEspada = 5;
        }else if(numEspada>50 && numEspada<=75){
            System.out.println("Tu espada es de hierro. (6 de daño)");
            dañoEspada = 6;
        }else{
            System.out.println("Tu espada es de diamante. (7 de daño)");
            dañoEspada = 7;
        }        
        
        while(vidaJugador>0 && vidaZombie>0){
            golpes++;
            System.out.println("Zombie atacó con " + dañoZombie + " de fuerza.");
            Thread.sleep(1000);
            vidaJugador = vidaJugador - dañoZombie;
            if (vidaJugador<=0){
                vidaJugador=0;
                break;
            }
            System.out.println("Al jugador le queda: " + vidaJugador + " de vida.");
            Thread.sleep(1000);
            System.out.println("Jugador ataca a Zombie con " + dañoEspada + " de daño.");
            Thread.sleep(1000);
            vidaZombie = vidaZombie - dañoEspada;
            if (vidaZombie<=0){
                vidaZombie=0;
                System.out.println("Zombie ha muerto en " + golpes + " golpes.");
                break;
            }
            System.out.println("Zombie a " + vidaZombie + " de vida.");
            Thread.sleep(1000);
        }
        itemsZombie = r.nextInt(101);
        carnePodrida = r.nextInt(3);
        if (vidaZombie<=0){
            if(itemsZombie!=100){
                System.out.println("Has recibido " + carnePodrida + " de carne podrida.");
                carnePodridaFinal = carnePodridaFinal + carnePodrida;
            }else {
                System.out.println("Que suerte! Has recibido un lingote de hierro.");
                hierro++;
            }
        }else if (vidaJugador<=0){
            System.out.println("Jugador ha muerto por un Zombie en " + golpes + " golpes.");
        }
            System.out.println("|=-=-=-=-=-=-=-=-=-=|");
            System.out.println("| Volver a jugar (v)|");
            System.out.println("| Salir del juego(s)|");
            System.out.println("|=-=-=-=-=-=-=-=-=-=|");
            
            respuestaFinal = teclado.nextLine().charAt(0);
             
            if (respuestaFinal=='v' || respuestaFinal=='V'){
                finalizarJuego=2;
            }else if (respuestaFinal=='s' || respuestaFinal=='S') {
                finalizarJuego=1;
            }
        }
        
        System.out.println("Has obtenido " + carnePodridaFinal + " de carne podrida.");
        if(hierro>0){
            System.out.println("También has obtenido " + hierro + " lingotes de hierro.");
        }
        
    }
    
}

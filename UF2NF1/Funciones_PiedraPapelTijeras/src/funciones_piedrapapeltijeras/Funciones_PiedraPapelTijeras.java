/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones_piedrapapeltijeras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Funciones_PiedraPapelTijeras {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Piedra(1), papel(2) y tijeras(3)");
        int num=0, eleccionOrdenador, eleccionUsuario, resultado, puntosJ=0, puntosM=0;
        boolean seguir;
        
        do{
        eleccionOrdenador = tirarOrdenador(r);
        eleccionUsuario = tiradaUsuario(num, teclado);
        resultado = comprobarGanador(eleccionOrdenador, eleccionUsuario);
        mostrarJugada(eleccionOrdenador, eleccionUsuario, resultado);
        puntosJ = sumaPuntosJ(resultado, puntosJ);
        puntosM = sumaPuntosM(resultado, puntosM);
        mostrarPuntos(puntosJ, puntosM);
        seguir = seguirJugando(puntosJ, puntosM);
        }while(seguir!=false);
        
        ganadorFinal(puntosJ, puntosM);
    }
    public static int tirarOrdenador(Random r){
        int numrandom = r.nextInt(3);
        switch (numrandom) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }
    public static int tiradaUsuario(int num, Scanner teclado){
        do{
            System.out.print("Escoge: ");
            num = teclado.nextInt();
            if(num<1 && num>3){
                System.out.println("! Error, escoge entre 1, 2 o 3");
            }
        }while(num>1 && num<3 && num!=2);
        return num;
    }
    public static int comprobarGanador(int maquina, int jugador){
        if((maquina==0 && jugador==2) || (maquina==1 && jugador==3) || (maquina==2 && jugador==1)){
            return 1;
        }else if((maquina==0 && jugador==3) || (maquina==1 && jugador==1) || (maquina==2 && jugador==2)){
            return -1;
        }else{
            return 0;
        }
    }
    public static void mostrarJugada(int maquina, int jugador, int ganador){
        switch (jugador) {
            case 1:
                System.out.println("=-=-=-=-=-=-=-=-=");
                System.out.println("Has sacado Piedra.");
                break;
            case 2:
                System.out.println("=-=-=-=-=-=-=-=-=");
                System.out.println("Has sacado Papel.");
                break;
            case 3:
                System.out.println("=-=-=-=-=-=-=-=-=");
                System.out.println("Has sacado Tijeras.");
                break;
            default:
                break;
        }
        switch (maquina) {
            case 0:
                System.out.println("La máquina ha sacado Piedra.");
                break;
            case 1:
                System.out.println("La máquina ha sacado Papel.");
                break;
            default:
                System.out.println("La máquina ha sacado Tijeras.");
                break;
        }
        switch (ganador) {
            case 1:
                System.out.println("Has ganado!");
                break;
            case -1:
                System.out.println("Ha ganado la máquina.");
                break;
            default:
                System.out.println("Empate!");
                break;
        }
    }
    public static int sumaPuntosJ(int ganador, int contadorJ){
        if(ganador==1){
            contadorJ++;
        }else{
            contadorJ = contadorJ+0;
        }
        return contadorJ;
    }
    public static int sumaPuntosM(int ganador, int contadorM){
        if(ganador==-1){
            contadorM++;
        }else{
            contadorM = contadorM+0;
        }
        return contadorM;
    }
    public static void mostrarPuntos(int contadorJ, int contadorM){
        System.out.println("Puntos del jugador: " + contadorJ);
        System.out.println("Puntos de la máquina: " + contadorM);
    }
    public static boolean seguirJugando(int contadorJ, int contadorM){
        if(contadorJ>=5 || contadorM>=5){
            return false;
        }else{
            return true;
        }
    }
    public static void ganadorFinal(int contadorJ, int contadorM){
        if(contadorJ==5){
            System.out.println("HAS GANADOO! WOW");
            System.out.println("=-=-=-=-=-=-=-=-=");
        }else if(contadorM==5){
            System.out.println("Ha ganado la máquina :(");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }
    
}

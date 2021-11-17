/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int saldo, num=-1, elegirnumero, dineroapuesta, bola, premio=0, dineroFinal;
        boolean resultado, seguir;
        saldo = dineroInicial();
        do{
        dineroapuesta = pedirDineroApuesta(saldo);
        elegirnumero = pedirnumero(num);
        bola = tirarbola();
        resultado = comprobarResultado(elegirnumero, bola);
        if(resultado==true){
            System.out.println("Has ganado!!");
            premio = calcularPremio(elegirnumero, dineroapuesta);
        }else{
            System.out.println("Has perdido. :(");
        }
        dineroFinal = actualizarDinero(saldo, dineroapuesta, premio, resultado);
        System.out.println("Tu saldo es de: " + dineroFinal);
        saldo = dineroFinal;
        seguir = seguirJugando(saldo); 
        }while(seguir!=false);
    }
    public static int dineroInicial(){
        int dinero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cuánto dinero tienes: ");
        dinero = teclado.nextInt();
        return dinero;
    }
    public static int pedirnumero(int num){
        Scanner teclado = new Scanner(System.in);
        while(!(num<=38 && num>=0)){
        System.out.print("Elige un número del 0 al 38 (37 al impar y el 38 al par): ");
        num = teclado.nextInt();
        }
        return num;
    }
    public static int tirarbola(){
        Random r = new Random();
        int numrandom = r.nextInt(37);
        System.out.println("La bola gira y....");
        System.out.println("Ha salido " + numrandom + "!");
        return numrandom;
    }
    public static int pedirDineroApuesta(int dinero_tengo){
        Scanner teclado = new Scanner(System.in);
        int dinero_apuesta;
        do{
        System.out.print("Cuánto quieres apostar? ");
        dinero_apuesta = teclado.nextInt();
        }while(!(dinero_apuesta<=dinero_tengo));
        return dinero_apuesta;
    }
    public static boolean comprobarResultado(int numapostado, int bola){
        boolean ganado=false;
        if(numapostado==bola){
            ganado=true;
        }else if(numapostado==38){
            if(bola%2==0){
                ganado=true;
            }
        }else if(numapostado==37){
            if(bola%2!=0){
                ganado=true;
            }
        }
    return ganado;
    }
    public static int calcularPremio(int numapostado, int cantidad){
        int premio;
        switch (numapostado) {
            case 37:
                premio = cantidad * 2;
                break;
            case 38:
                premio = cantidad * 2;
                break;
            default:
                premio = cantidad * 36;
                break;
        }
        return premio;
    }
    public static boolean seguirJugando(int saldo){
        Scanner teclado = new Scanner(System.in);
        char eleccion;
        if(saldo<=0){
            System.out.println("Ahora eres pobre :)");
            return false;
        }else{
        do{
            System.out.println("Quieres jugar más? (s/n)");
            eleccion = teclado.nextLine().charAt(0);
        }while(!(eleccion=='s' || eleccion=='n' || eleccion=='S' || eleccion=='N'));
        if(eleccion=='s' || eleccion=='S'){
            return true;
        }else{
            return false;
        }
        }
    }
    public static int actualizarDinero(int saldo, int numapostado, int premio, boolean resultado){
        if(resultado==false){
            saldo = saldo-numapostado;
            return saldo;
        }else{
            saldo = saldo + premio;
        }
        return saldo;
    }
}

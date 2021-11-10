/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.pkg1_calcularnivel;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PT1_CalcularNivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char arma;
        int nivel;
        int enemigos_eliminados;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qué nivel tienes?");
        nivel = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Elimina a los enemigos escogiendo el arma que quieras:");
        System.out.println("|Espada(e) 7 de daño | Hacha(h) 9 de daño|");
        arma = teclado.nextLine().charAt(0);
        
        switch (arma) {
            case 'e':
            case 'E':
                System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
                System.out.println("|Has escogido: Espada (7 de daño)|");
                enemigos_eliminados = 5;
                System.out.println("|Enemigos eliminados: 5          |");
                break;
            case 'h':
            case 'H':
                System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
                System.out.println("|Has escogido: Hacha (9 de daño) |");
                enemigos_eliminados = 8;
                System.out.println("|Enemigos eliminados: 8          |");
                break;
            default:
                System.out.println("Datos erróneos");
                enemigos_eliminados = 0;
                break;
        }
 
        if(nivel<=30){ //Cada enemigo cuenta como 4 niveles
            enemigos_eliminados = enemigos_eliminados * 4;
            double NivelFinal = nivel + enemigos_eliminados;
            System.out.println("|Tú nivel aumenta a: " + NivelFinal + "        |");
        }else if (nivel>30 && nivel<=60){ //Cada enemigo cuenta como 3 niveles
            enemigos_eliminados = enemigos_eliminados * 3;
            double NivelFinal = nivel + enemigos_eliminados;
            System.out.println("|Tú nivel aumenta a: " + NivelFinal + "        |");
        } else if (nivel>60 && nivel<=100){ //Cada enemigo cuenta como 2 niveles
            enemigos_eliminados = enemigos_eliminados * 2;
            double NivelFinal = nivel + enemigos_eliminados;
            System.out.println("|Tú nivel aumenta a: " + NivelFinal + "        |");
        } else { //Cada enemigo cuenta como 1 nivel
            enemigos_eliminados = enemigos_eliminados * 1;
            double NivelFinal = nivel + enemigos_eliminados;
            System.out.println("|Tú nivel aumenta a: " + NivelFinal + "       |");
        }
        System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
    }
    
}

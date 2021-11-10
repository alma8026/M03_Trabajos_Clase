/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portaventura;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PortAventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int personas, menores;
        int adultos = 0;
        double dineroTotal, dineroDescuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántas personas vais al PortAventura?");
        personas = teclado.nextInt();
        System.out.println("Cuántos son menores?");
        menores = teclado.nextInt();
        
        adultos = personas - menores;
        if (personas<10){ //Entrada normal
            dineroTotal = (adultos*20) + (menores*10);
        }else if (personas>=10 && personas<25){ //Descuento por ser más de 10 personas
            dineroTotal = (adultos*20) + (menores*10);
            dineroDescuento = dineroTotal * 25/100;
            dineroTotal = dineroTotal - dineroDescuento;
        }else if (personas>=25){ //Por ser mas de 25 personas, descuento y 1 entrada gratis
            adultos = adultos -1;
            dineroTotal = (adultos*20) + (menores*10);
            dineroDescuento = dineroTotal * 25/100;
            dineroTotal = dineroTotal - dineroDescuento;
        }else { //Opción de error por si acaso
            dineroTotal = 0;
            System.out.println("Opción errónea, introduzca de nuevo.");
        }
        
        System.out.println("En total costará: " + dineroTotal + " euros.");
    }
    
}

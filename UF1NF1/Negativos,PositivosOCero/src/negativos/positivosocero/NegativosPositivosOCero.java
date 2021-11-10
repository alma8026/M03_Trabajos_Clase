/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negativos.positivosocero;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NegativosPositivosOCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, cont, negativos=0, positivos=0;
        boolean detener=false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce números (pon 0 para finalizar):");
        
        for (cont=0; !detener; cont++){
            num = teclado.nextInt();
            if (num==0){
                detener=true;
            }else{
                if (num<0){
                    negativos++;
                }else if (num>0) {
                    positivos++;
                }
            }
        }
        System.out.println("Has puesto: " + cont + " números.");
        System.out.println("Números positivos: " + positivos);
        if (negativos>0){
            System.out.println("Has puesto algún negativo.");
        }else {
            System.out.println("No has puesto ningún negativo.");
        }
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números cero: 1");
        
        
    }
    
}

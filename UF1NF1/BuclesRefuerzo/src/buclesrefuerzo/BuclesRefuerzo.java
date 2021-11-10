/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesrefuerzo;

/**
 *
 * @author alumne
 */
public class BuclesRefuerzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("|=--=--==--=--=|");
        System.out.println("|TABLA DEL 1-10|");
        System.out.println("|=--=--==--=--=|");
        int cont, tabla;
        
        for (tabla=1; tabla<=10; tabla++){
            System.out.println("|=-=--==--=-=|");
            System.out.println("|Tabla del  " + tabla + "|");
            System.out.println("|=-=--==--=-=|");
        for (cont = 1; cont <= 10; cont++) {
            System.out.println(cont + " * " + tabla + " = " + (tabla*cont));
        }
        }
        
    }
    
}

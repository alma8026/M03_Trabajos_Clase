/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigoascii;

/**
 *
 * @author alumne
 */
public class CodigoASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Código ASCII de la A-Z");
        char abecedario;
        int ascii;
        for (abecedario='A'; abecedario<='Z'; abecedario++){
            ascii = (int) abecedario;
            System.out.println(abecedario + " en ASCII: " + ascii);
            
        }
        
        
        
    }
    
}

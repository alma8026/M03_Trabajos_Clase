/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomcartas;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class RandomCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        int paloCarta = r.nextInt(4)+1;
        int numCarta = r.nextInt(12)+1;
        System.out.println("|BARAJA ESPAÑOLA|");
        System.out.print("Has sacado: " + numCarta);
        
        switch (paloCarta){
            case 1:
                System.out.println(" de oros.");
                break;
            case 2:
                System.out.println(" de bastos.");
                break;
            case 3: 
                System.out.println(" de espadas.");
                break;
            case 4:
                System.out.println(" de copas.");
                break;
        }
        
        
        
    }
    
}

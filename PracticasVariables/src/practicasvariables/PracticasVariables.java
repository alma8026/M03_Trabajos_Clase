/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvariables;

/**
 *
 * @author alumne
 */
public class PracticasVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipodata (float, int,...)nombreinventado=valor;
        int numero;
        double x = 9.25;
        double numerodecimales;
        boolean cierto_falso = true;
        numero=40;
        numerodecimales = 10.25;
        int doble;
        // calcular doble de la variable numero
        
        doble = numero*2;
        cierto_falso = (numerodecimales != x);
        
        System.out.println("numero-> " + numero);
        System.out.println("su doble es " + doble);
        System.out.println("numero-> " + x);
        System.out.println("el booleano vale " + cierto_falso);
        
        
    }
    
}

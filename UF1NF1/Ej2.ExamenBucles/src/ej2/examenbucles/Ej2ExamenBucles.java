/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.examenbucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej2ExamenBucles {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        int opcion, cont=0, num=1;
        int num1, num2;
        int mayor, menor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("         ******MENÚ******");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
        System.out.println("|0- Salir                          |");
        System.out.println("|1- Escribir 10 veces              |");
        System.out.println("|2- Cuenta atrás timbre            |");
        System.out.println("|3- Número pares entre dos valores |");
        System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
        System.out.print("Escoge opción (0, 1, 2 o 3): ");
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 0:
                break;
            case 1:
                while(cont!=10){
                    System.out.println(num + " A clase se viene a trabajar.");
                    cont++;
                    num++;
                }
                break;
            case 2:
                num=10;
                while(cont!=11){
                    Thread.sleep(1000);
                    System.out.print(num + " ");
                    cont++;
                    num--;
                }
                Thread.sleep(1000);
                System.out.println("RIIIIINGGGG!!!!!");
                break;
            case 3:
                System.out.print("Introduce el primer num: ");
                num1 = teclado.nextInt();
                System.out.print("Introduce el segundo num: ");
                num2 = teclado.nextInt();
                if(num1==num2 && num1%2!=0){
                    System.out.println("No hay números pares entre los dos.");
                }else if (num1==num2 && num1%2==0){
                    System.out.println("No hay números pares entre los dos.");
                }else if (num1<0 || num2<0){
                    System.out.println("Valores negativos, introduzca de nuevo.");
                }else if (num2<num1){
                    menor = num2;
                    mayor = num1;
                while(cont!=mayor){
                    menor++;
                    cont=menor;
                    if(mayor==cont){
                        break;
                    }else if(menor%2==0){
                        System.out.print(menor + " ");
                    }
                }
                }else{
                while(cont!=num2){
                    num1++;
                    cont=num1;
                    if(num2==cont){
                        break;
                    }else if(num1%2==0){
                        System.out.print(num1 + " ");
                    }
                }
                }
                System.out.println("");
                break;
            default:
                System.out.println("Opción No Valida.");
                break;
        }
    }
    
}

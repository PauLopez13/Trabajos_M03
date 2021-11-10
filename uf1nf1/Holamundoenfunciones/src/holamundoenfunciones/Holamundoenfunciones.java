/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundoenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Holamundoenfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //sc.
        helloworld();
        String nombre ="Pau López Miras";
        helloworldnombre(nombre);
        
        int valor = 5;       
        System.out.println("Tu valor antes de la clonación= " + valor);

        aumentaendos(valor);
        
    }

    //funcion que muestra por pantalla helloworld
    public static void helloworld()
    {
        System.out.println("Hello World en funciones");
    } // helloworld

    /**ret
     * Escribirá helloworld acompañado del nombre
     * @param nom Es la variable que contiene el nombre
     */
    
    public static void helloworldnombre(String nom)
    {
        System.out.println("Hello world. " + nom + " How are you?");
    }

    /**
     * Aumentará el valor que te pasan en dos
     * @param va
*/
    public static void aumentaendos(int valor)
            
    {
        valor = valor + 2;
        System.out.println("Tu valor después de la clonación = " + valor);
        
    }

}

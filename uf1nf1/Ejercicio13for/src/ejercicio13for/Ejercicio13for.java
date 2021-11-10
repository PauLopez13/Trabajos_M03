/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13for;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio13for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        int minimo = 1;
        int maximo = 100;
        int numAdivinar = (minimo + maximo) / 2;
        char respuesta;

        do {
            numAdivinar = (minimo + maximo) / 2;
            Scanner teclado = new Scanner(System.in);
            System.out.println("El numero adivina es " + numAdivinar + "?");
            System.out.println("'Mayor' = 'M', 'inFerior' = 'F', 'Igual' = 'I' al numero --> " + numAdivinar);
            respuesta = teclado.nextLine().charAt(0);
            System.out.println("Tu respuesta es = " + respuesta);

            if (respuesta == 'M' || respuesta == 'm') {
                minimo = numAdivinar;
            } else if (respuesta == 'F' || respuesta == 'f') {
                maximo = numAdivinar;
            }

        } while (respuesta != 'I' && respuesta != 'i');
        //resouesta !='I' && respuesta != 'i'
        System.out.println("Tu numero és= " + numAdivinar);
    }

}

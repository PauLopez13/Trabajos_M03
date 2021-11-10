/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclashroyale.pkg5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioCLASHROYALE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerodecopas;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu numero de copas?");
        numerodecopas = teclado.nextInt();

        if (numerodecopas < 2000) {
            char magoelectrico0;
            char esbirro1;
            char eleccion;
            teclado.nextLine();

            System.out.println("Escoge entre Mago electrico y esbirro (magoelectrico, m. y Esbirro, e. :");
            eleccion = teclado.nextLine().charAt(0);

            if (eleccion == 'm' || eleccion == 'M') {
                System.out.println("Has elegido magoelectrico");
            } else if (eleccion == 'e' || eleccion == 'E') {
                System.out.println("Has elegido Esbirro, felicidades");
            } else {
                System.out.println("Tienes que elegir la letra e o m, la m és el mago electrico y la e és el esbirro");
            }

        } 
        
        else if (numerodecopas < 3000)
                {
            char bandida;
            char caballero;
            char eleccion;

            caballero = 'c';
            bandida = 'b';
            teclado.nextLine();//limpiar reutrn nectint
            System.out.println("Escoge entre Bandida y caballero (bandida, b. y Caballero, c. :");
            eleccion = teclado.nextLine().charAt(0);

            if (eleccion == 'b' || eleccion == 'B') {
                System.out.println("Has elegido Bandida, felicidades");
            } else if (eleccion == 'c' || eleccion == 'C') {
                System.out.println("Has elegido Caballero, felicidades");
            } else {
                System.out.println("Tienes que elegir un numero del 1 - 0, el 0 és el Bandida y el 1 és el Caballero");
            }

        }
        
        else
        {
            char gigante;
            char esqueletos;
            char eleccion;

            gigante = 'g';
            esqueletos = 'e';
            teclado.nextLine();//limpiar reutrn nectint
            System.out.println("Escoge entre Gigante y esqueletos (Gigante, g. y Esqueletos, e. :");
            eleccion = teclado.nextLine().charAt(0);

            if (eleccion == 'g' || eleccion == 'G') {
                System.out.println("Has elegido Gigante, felicidades");
            } else if (eleccion == 'e' || eleccion == 'E') {
                System.out.println("Has elegido Esqueletos, felicidades");
            } else {
                System.out.println("Tienes que elegir una letra, la g és para escoger gigante y la e para escoger esqueletos");
            }

        }

        
        
        
        
        
    }

}

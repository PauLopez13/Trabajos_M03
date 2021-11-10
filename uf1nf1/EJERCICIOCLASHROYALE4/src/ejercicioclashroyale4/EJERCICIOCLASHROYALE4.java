/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclashroyale4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EJERCICIOCLASHROYALE4 {

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

        } else {
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
        
        
        
        
        
        
    }
    
}

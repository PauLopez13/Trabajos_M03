/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocasafunciones1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejerciciocasafunciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                
        Scanner sc = new Scanner(System.in);
        mostrarmenu();
        int eleccion = Validaropcion();
        System.out.println("Valor1");
        int numero1 = numeropositivo();
        System.out.println("Valor2");
        int numero2 = numeropositivo ();
        
        if (eleccion == 1) {
            int resta = restanumero(numero1, numero2);
            System.out.println("La resta és = " + resta);
        } else if (eleccion == 0) {
            int suma = sumanumero(numero1, numero2);
            System.out.println("La suma és = " + suma);
        } else if (eleccion == 2) {
            int multi = multiplicanumero(numero1, numero2);
            System.out.println("La multiplicación és de = " + multi);

        } else if (eleccion == 3) {
            double divi = dividirnumero(numero1, numero2);
            System.out.println("La división es = " + divi);
        }

    }

    public static int restanumero(int numero1, int numero2) {

        int resta = numero1 - numero2;
        return resta;//El return doble te devuelve solo el valor que tenga el return, en este caso doble

    }

    public static int sumanumero(int numero1, int numero2) {

        int suma = numero1 + numero2;
        return suma;//El return doble te devuelve solo el valor que tenga el return, en este caso doble

    }

    public static int multiplicanumero(int numero1, int numero2) {
        int producto = numero1 * numero2;
        return producto;//El return doble te devuelve solo el valor que tenga el return, en este caso doble
    }

    public static double dividirnumero(int numero1, int numero2) {
        double divi = numero1 / numero2;
        return divi;//El return doble te devuelve solo el valor que tenga el return, en este caso doble

    }
//te muestra el menu

    public static void mostrarmenu() {
        System.out.println("Que prefieres suma o resta? resta = 1, suma = 0, división = 2, multiplicación = 3");
    }
// te pide la opcion de la calculadora y solo te aceptara del 1 al 4, si no, volverá a pedir.

    public static int Validaropcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        while (opcion < 0 || opcion > 3) {

            System.out.println("Tienes que volver a escribir el numero, recuerda, del 0 - 3!!");
            opcion = sc.nextInt();
        }
        return opcion;

    }

    public static int numeropositivo() {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            
            System.out.println("coloca tu numero positivo" );
            opcion = sc.nextInt();

            if (opcion < 0) {
                System.out.println(" No has colocado un numero positivo.");
            }
        }while (opcion < 0);
        return opcion;

    }

}

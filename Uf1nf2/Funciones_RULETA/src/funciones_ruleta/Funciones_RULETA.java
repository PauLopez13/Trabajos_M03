/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones_ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Funciones_RULETA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0, dinero = 0;
        boolean comprovarresu = false;
        boolean seguirjugando = false;
        int numrandom = 0;
        int actualizardinero;

        do {
            dinerodisponible();
            pedirdinero(dinero);
            elegirnumero(numero);
            tirarbola(numrandom);
            comprovarresu(numero, numrandom);
            numeronormal(numero, numrandom);
            calcularpremio(comprovarresu, dinero);
            seguirjugando(dinero, numero);

        } while (seguirjugando != true);

    }

    //FUNCIONES:
    private static void pedirdinero(int dinero) {
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Cuanto dinero quieres apostar? :)");
            dinero = teclado.nextInt();
        } while (dinero <= 0);

    }

    private static int elegirnumero(int numero) {
        Scanner teclado = new Scanner(System.in);

        while (numero > 38 || numero < 0); // CUIDAO
        {
            System.out.println("Elige un numero del 0 - 38");
            numero = teclado.nextInt();
        }

        return numero;

    }

    private static int tirarbola(int numrandom) {
        Random r = new Random();
        numrandom = r.nextInt(37);
        System.out.println("Ha tocado el numero = " + numrandom);
        return numrandom;

    }

    private static boolean comprovarresu(int numero, int numrandom) {

        if (numero == 38 && numero == 37) {
            return true; // si true, és impar o par.

        } else {

            return false;  // si false, és un numero normal.
        }

    }

    private static void calcularpremio(boolean comprovarresu, int dinero) {

        if (comprovarresu == false) {
            dinero = dinero * 36;

        } else {
            dinero = dinero * 2;
        }

    }

    private static boolean seguirjugando(int dinero, int numero) {
        Scanner teclado = new Scanner(System.in);
        char respuesta;
        System.out.println("Quieres seguir jugando? (s/n)");
        respuesta = teclado.nextLine().charAt(0);

        if (dinero <= 0) {
            return false;
        } else if (respuesta == 'n' || respuesta == 'N') {
            return false;
        } else if (respuesta == 's' || respuesta == 'S') {
            return true;

        } else {
            return false;
        }

    }

    private static boolean numeronormal(int numero, int numrandom) {

        if (numero == numrandom) {
            return true;
        } else {
            return false;
        }

    }

    private static int dinerodisponible() {
        Scanner teclado = new Scanner(System.in);
        int dinero;

        do {
            System.out.println("Cuanto dinero tienes disponible?");
            dinero = teclado.nextInt();
        } while (dinero <= 0);

        return dinero;

    }

}

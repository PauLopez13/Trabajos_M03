/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio18funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        char letra;

        System.out.println("Cual és tu numero?");
        num = teclado.nextInt();
        
        letra = operacionnumero(num);

        System.out.println("Tu letra és = " + letra);
    }

    
    
    private static char operacionnumero(int num) {

        char letra;
        int residuo = num % 23;

        switch (residuo) {
            case 0:
                letra = 't';
                break;
            case 1:
                letra = 'r';
                break;
            case 2:
                letra = 'w';
                break;
            default:
                letra = '%';
                break;
            case 3:
                letra = 'a';
                break;
            case 4:
                letra = 'g';
                break;
            case 5:
                letra = 'm';
                break;
            case 6:
                letra = 'y';
                break;
            case 7:
                letra = 'f';
                break;
            case 8:
                letra = 'p';
                break;
            case 9:
                letra = 'd';
                break;
            case 10:
                letra = 'x';
                break;
            case 11:
                letra = 'b';
                break;
            case 12:
                letra = 'n';
                break;
            case 13:
                letra = 'j';
                break;
            case 14:
                letra = 'z';
                break;
            case 15:
                letra = 's';
                break;
            case 16:
                letra = 'q';
                break;
            case 17:
                letra = 'v';
                break;
            case 18:
                letra = 'h';
                break;
            case 19:
                letra = 'l';
                break;
            case 20:
                letra = 'c';
                break;
            case 21:
                letra = 'k';
                break;
            case 22:
                letra = 'e';
                break;

        }
        return letra;

    }

}

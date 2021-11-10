/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int horas;
        int minutos;
        int segundos;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique sus Horas porfavor");
        horas = teclado.nextInt();

        System.out.println("Indique sus minutos porfavor");
        minutos = teclado.nextInt();

        System.out.println("Indique sus segundos porfavor");
        segundos = teclado.nextInt();

        segundos = segundos + 1;

        
        if (segundos == 59) {
            System.out.println("Sus segundos són: 00");
        } else if (minutos == 59) {
            System.out.println("Tus minutos són: 00");
        } else if (horas == 24) {
            System.out.println("Tus horas són: 00");
        }
        else{
        System.out.println("Sus horas són: " + horas + ", sus minutos són: " + minutos + ", sus segundos són: " + segundos);
        }
        }

}

}

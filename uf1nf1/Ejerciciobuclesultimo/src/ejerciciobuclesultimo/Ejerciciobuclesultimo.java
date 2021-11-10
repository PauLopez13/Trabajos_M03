/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobuclesultimo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejerciciobuclesultimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tabla;
        int cont = 0;
        int num;
        int tablaresultado;
        System.out.println("TABLA DEL 1-10");

        for (tabla = 1; tabla <= 10; tabla++) {
            System.out.println(" ");
            System.out.println("Tabla del = " + tabla);
            for (cont = 0; cont <= 10; cont++) {

                tablaresultado = tabla + (tabla * cont);

                System.out.println(cont + "*" + tabla + "=" + (tabla * cont));
            }

        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalepegartorres;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CLASHROYALEPEGARTORRES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int vidaTorre = 0, vidaLenyador = 0;
        int torre;
        int lenyador;
        int nivelTorre = 0, nivelLenyador = 0;
        int dañoLenyador = 0, dañotorre = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual és el nivel de la torre? (INDIQUE UN NUMERO DEL 9 - 13)");
        nivelTorre = teclado.nextInt();
        System.out.println("Cual és el nivel del leñador? (INDIQUE UN NUMERO DEL 9 - 13)");
        nivelLenyador = teclado.nextInt();

        if (nivelTorre == 9) {
            vidaTorre = 2534;
            dañotorre = 90;
            System.out.println("La torre tiene = " + vidaTorre + "vida");
        } else if (nivelTorre == 10) {
            vidaTorre = 2786;
            dañotorre = 99;
            System.out.println(" La torre tiene = " + vidaTorre + "vida");
        } else if (nivelTorre == 11) {
            vidaTorre = 3052;
            dañotorre = 109;
            System.out.println("La torre tiene = " + vidaTorre + "vida");
        } else if (nivelTorre == 12) {
            vidaTorre = 3346;
            dañotorre = 119;
            System.out.println("La torre tiene = " + vidaTorre + "vida");
        } else if (nivelTorre == 13) {
            vidaTorre = 3668;
            dañotorre = 131;
            System.out.println("La torre tiene = " + vidaTorre + "vida");
        } else {
            System.out.println("Tienes que colocar 9, 10, 11, 12 o 13 melón");
        }

        if (nivelLenyador == 9) {
            dañoLenyador = 200;
            vidaLenyador = 1060;
            System.out.println("El lenyador tiene = " + vidaLenyador + " de vida.");
        } else if (nivelLenyador == 10) {
            dañoLenyador = 220;
            vidaLenyador = 1166;
            System.out.println("El lenyador tiene = " + vidaLenyador + " de vida.");

        } else if (nivelLenyador == 11) {
            dañoLenyador = 242;
            vidaLenyador = 1282;
            System.out.println("El lenyador tiene = " + vidaLenyador + " de vida.");

        } else if (nivelLenyador == 12) {
            dañoLenyador = 266;
            vidaLenyador = 1409;
            System.out.println("El lenyador tiene = " + vidaLenyador + " de vida.");

        } else if (nivelLenyador == 13) {
            dañoLenyador = 292;
            vidaLenyador = 1547;
            System.out.println("El lenyador tiene = " + vidaLenyador + " de vida.");

        }

        while (vidaTorre != 0 && vidaLenyador != 0) {
            vidaTorre = vidaTorre - dañoLenyador;
            vidaLenyador = vidaLenyador - (dañotorre*2);
            if (vidaTorre <=0)
            {
            vidaTorre = 0;
            }
            if (vidaLenyador <= 0)
            {
            vidaLenyador = 0;
            }
            System.out.println("La vida del lenyador és = " + vidaLenyador);
            System.out.println("La vida de la torre és = " + vidaTorre);
       

        
        }
             if (vidaTorre <= 0) {
                System.out.println("Ha ganado el lenyador");

            } else if (vidaLenyador <= 0)
            {
                System.out.println("Ha ganado la torre");
            }

        

    }
} 

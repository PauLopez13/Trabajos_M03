/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horasextra;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HORASEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int horas_extra;
        int sueldo;
        int categoria;
        int dineroextra;
        int dinerototal;
        final int Preu_hora_categoria1 = 30;
        final int Preu_hora_categoria2 = 35;
        final int Preu_hora_categoria3 = 40;
        final int Preu_hora_categoria4 = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique la cifra de tu sueldo:");
        sueldo = teclado.nextInt();
        System.out.println("Tu sueldo és de: " + sueldo);
        System.out.println("Indique su categoria:");
        categoria = teclado.nextInt();
        System.out.println("Tu categoria és de: " + categoria);
        System.out.println("Indique sus horas extra:");
        horas_extra = teclado.nextInt();
        System.out.println("Sus horas extras són= " + horas_extra);

        if (categoria == 1) {
            dineroextra = horas_extra * Preu_hora_categoria1;

        } else if (categoria == 2) {
            dineroextra = horas_extra * Preu_hora_categoria2;

        } else if (categoria == 3) {
            dineroextra = horas_extra * Preu_hora_categoria3;

        } else {
            dineroextra = horas_extra * Preu_hora_categoria4;

        }

        dinerototal = sueldo + dineroextra;
        System.out.println("Tu dinero total és de= " + dinerototal);
    }

}

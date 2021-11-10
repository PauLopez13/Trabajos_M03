/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofunciones5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejerciciofunciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double millas;
        double resultado;
        System.out.println("Cuales són tus millas?");
        millas = sc.nextDouble();

        resultado = millas_a_kilometros(millas);

        System.out.println("Tus quilometros són:" + resultado);
    }

    private static double millas_a_kilometros(double millas) {

        double kilometros = 1.60934;
        double resultado;
        resultado = millas * kilometros;
        if (millas <= -1) {
            return -1;
        }
        return resultado;

    }

}

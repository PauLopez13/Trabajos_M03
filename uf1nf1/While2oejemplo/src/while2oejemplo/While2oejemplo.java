/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while2oejemplo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class While2oejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero, acumulandosuma = 0;
        Scanner teclado = new Scanner(System.in);

        boolean finalBucle = false;

        do {
            System.out.println("Cuando sume mas de 100 parará la suma.");
            numero = teclado.nextInt();


            if (numero > 0) {
                acumulandosuma = acumulandosuma + numero;
                System.out.println("El acumulado parciál : " + acumulandosuma);

            } else if (acumulandosuma >= 100) {
                finalBucle = true;
            }
            
            else if (numero < 0) {
                System.out.println("No se pueden calcular numeros negativos");

            }

        } while (!finalBucle);
        System.out.println(
                "El total de la suma és = " + acumulandosuma);
        System.out.println(
                "Has escrito una suma mayor a 100, se acabó el programa");

    }

}

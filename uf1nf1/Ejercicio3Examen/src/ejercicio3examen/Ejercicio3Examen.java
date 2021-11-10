/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio3Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numpersonas;
        int nummenores;
        double precioadultos;
        double preciomenores;
        double precio;
        double descuento;
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas personas entrareis a portaventura?");
        numpersonas = teclado.nextInt();

        System.out.println("Cuantos menores hay?");
        nummenores = teclado.nextInt();

        if (numpersonas < 10) {

            precioadultos = (numpersonas - nummenores) * 20;
            preciomenores = nummenores * 10;
            precio = precioadultos + preciomenores;
            System.out.println("El precio total és de = " + precio + "€");

        } else if (numpersonas >= 10 && numpersonas <= 25) {
            precioadultos = (numpersonas - nummenores) * 20;
            preciomenores = nummenores * 10;
            descuento = 0.25;
            precio = precioadultos + preciomenores / descuento;
               System.out.println("El precio total és de = " + precio + "€");

        } else if (numpersonas > 25) {
            numpersonas = numpersonas - 1;
            precioadultos = (numpersonas - nummenores) * 20;
            preciomenores = nummenores * 10;
            descuento = 0.25;
            precio = precioadultos + preciomenores / descuento;
               System.out.println("El precio total és de = " + precio + "€");

        }
        else
        {
            System.out.println("Cuidado!! no se puede tener numeros negativos, vuelve a inentarlo.");
        }
        

    }

}

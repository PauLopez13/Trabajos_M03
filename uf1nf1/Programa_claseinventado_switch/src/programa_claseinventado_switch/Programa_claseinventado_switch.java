/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa_claseinventado_switch;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Programa_claseinventado_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int respuesta;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique su elección, 1 = jugar nueva partida, 2 = Cargar partida guardada, 3 Ver records y 0 salir");
        respuesta = teclado.nextInt();
        System.out.println("su respuesta és = " + respuesta);

        switch (respuesta) {

            case 1:
                System.out.println("Usted ha elegido jugar nueva partida, comencemos!!");
                break;
            case 2:
                System.out.println("Usted ha elegido cargar partida guardada, comencemos!!");
                break;
            case 3:
                System.out.println("Usted ha elegido ver los records, comencemos!!");
                break;
            case 0:
                System.out.println("Usted ha elegido salir, nos vemos!!");
                break;
            default:
                System.out.println("Usted no ha elegido una opción valida, porfavor vuelva a intentarlo");
                break;

        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio10funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, año;
        boolean fechacorrecta;
        System.out.println("Introduce el dia = ");
        dia = sc.nextInt();
        System.out.println("Introduce el mes = ");
        mes = sc.nextInt();
        System.out.println("Introduce el año = ");
        año = sc.nextInt();

        fechacorrecta = funcionfecha(dia, mes, año);

        if (fechacorrecta == true)
        {
            System.out.println("fecha és cierta");
        }
        else if (fechacorrecta == false)
        {
            System.out.println("Tu fecha es falsa.");
        }
        
    }

    private static boolean funcionfecha(int dia, int mes, int año) {

        boolean correcto;

        if (dia > 30 || dia <= 0 || mes > 12 || mes <= 0 || año <= 0) {
            correcto = false;
        }
        else {
        
        correcto = true;
        }

        
                
        

        
        return correcto;
    }

}

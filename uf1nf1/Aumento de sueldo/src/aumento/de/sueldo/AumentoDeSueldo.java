/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aumento.de.sueldo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AumentoDeSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sueldo;
        int sueldoaumento;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique la cifra de tu sueldo:");
        sueldo = teclado.nextInt();
        System.out.println("Tu sueldo és de: " + sueldo);

        if (sueldo < 18000) {
            sueldoaumento = sueldo * 12 / 100;
            sueldo = sueldo + sueldoaumento;
            System.out.println("El sueldo és de= " + sueldo);
        } else if (sueldo > 18000 && sueldo < 30000) {
            sueldoaumento = sueldo * 10 / 100;
            sueldo = sueldo + sueldoaumento;
            System.out.println("El sueldo será de= " + sueldo);
        } else if (sueldo > 30000 && sueldo < 45000) {
            sueldoaumento = sueldo * 8 / 100;
            sueldo = sueldo + sueldoaumento;
            System.out.println("El sueldo será de = " + sueldo);
        }
          else
        {
            sueldoaumento = sueldo * 6 / 100;
            sueldo = sueldo + sueldoaumento;
            System.out.println("El sueldo será de = " + sueldo);
        }
        
        
    }

}

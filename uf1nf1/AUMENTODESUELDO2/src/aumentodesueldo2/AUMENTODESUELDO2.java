/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aumentodesueldo2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AUMENTODESUELDO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int sueldo;
        int sueldodescuento;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique la cifra de tu sueldo:");
        sueldo = teclado.nextInt();
        System.out.println("Tu sueldo és de: " + sueldo);

        if (sueldo < 800) {
            sueldo = sueldo ;
            System.out.println("El sueldo és de= " + sueldo);
            
        } 
        
        else if (sueldo >= 800 && sueldo <= 1500) {
            sueldodescuento = sueldo * 6 / 100;
            sueldo = sueldo - sueldodescuento;
            System.out.println("El sueldo será de= " + sueldo);
        }
        
        
        else if (sueldo > 1500 && sueldo < 3000) {
            sueldodescuento = sueldo * 8 / 100;
            sueldo = sueldo - sueldodescuento;
            System.out.println("El sueldo será de = " + sueldo);
        }
        
        
        
          else
        {
            sueldodescuento = sueldo * 10 / 100;
            sueldo = sueldo - sueldodescuento;
            System.out.println("El sueldo será de = " + sueldo);
        }
        

    }
    
}

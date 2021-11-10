/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosnonulosfor;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Numerosnonulosfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, cont, positivo = 0, negativo = 0;
        boolean cero = false; 

        Scanner teclado = new Scanner(System.in);

        for (cont = 1; !cero; cont++) {

            System.out.println("Indique sus numeros:");
            num = teclado.nextInt();
            if (num > 0) {
                positivo++;
            } else if (num < 0) {
                negativo++;
                
            }

        }
        
        if (num<0)

        {
            System.out.println("hay minimo un negativo.");
        }
        else

        {System.out.println("no has colocado ningún negativo");}            
    }

}

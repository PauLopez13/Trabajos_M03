/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package realfor;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Realfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int npositivo = 0, nnegativo = 0;
        boolean existeNegarivo = false;
        int numIntroducido = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce el numero: (0 para salir)");
            numIntroducido = teclado.nextInt();

            if (numIntroducido < 0) {

                nnegativo++;
            }
            else if(numIntroducido>0)
                
            {
            npositivo++;
            
            }
                

        } while (numIntroducido != 0);

        
        System.out.println("Has puesto= " + npositivo + "Numeros positivos");
        System.out.println("has puesto= " + nnegativo + "Numeros negativos");
        
        
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petardoswii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PETARDOSWII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        int petardo1, petardo2, petardo3;
        int opción;

        petardo1=r.nextInt(20);
        petardo2=r.nextInt(20);
        petardo3=r.nextInt(20);
        
        System.out.println("Que petardo de los 3 eliges?");
        opción = teclado.nextInt();
        
        

                


    }
    
}

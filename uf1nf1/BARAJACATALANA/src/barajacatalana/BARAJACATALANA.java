/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barajacatalana;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class BARAJACATALANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();

        int palocarta = r.nextInt(4) + 1;
        int numCarta = r.nextInt(12) + 1;
        
        
        System.out.print("Has sacado " + numCarta + " ");
        switch(palocarta){
        
            case 1:
                System.out.println("De oros");
                break;
            case 2:
                System.out.println("De bastos");
                break;
            case 3:
                System.out.println("De espadas");
                break;
            case 4:
                System.out.println("De copas");
        
        }
        
    
    }
    
}

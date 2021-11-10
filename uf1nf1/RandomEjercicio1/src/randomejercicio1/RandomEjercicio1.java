/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomejercicio1;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class RandomEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        Random r = new Random();
        int numaleatorio = r.nextInt(10) + 1;
        System.out.println("El numero generado és el = " + numaleatorio);
    }

}

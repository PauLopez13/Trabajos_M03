/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocerelmayorfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Conocerelmayorfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        int mayor;
        System.out.println("Pon un valor1");
        valor1 = sc.nextInt();
        
        System.out.println("Pon un valor2");
        valor2 = sc.nextInt();
        
        mayor = masgrande(valor1, valor2);

        
        System.out.println("El numero más grande que has puesto és = " + mayor);

        
        
        
    }
   
    /**
     * 
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int masgrande(int valor1, int valor2)
            
    {
        int mas;
        if (valor1 > valor2)
        {
            mas = valor1;
        }
        else 
        {
            mas = valor2;
        }
        
        
        return mas;
    
    }
     


}

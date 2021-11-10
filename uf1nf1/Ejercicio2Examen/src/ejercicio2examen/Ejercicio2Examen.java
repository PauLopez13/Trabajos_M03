/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio2Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu numero");
        numero = teclado.nextInt();

        if (numero % 2 == 0 && numero %3 == 0) 
        {
            System.out.println("Numero par y divisible entre 3");
        }
        else if (numero %2 == 0)
                {
            System.out.println("Numero par");
        }
        
        else 
        {System.out.println("Numero impar");}

        //OTRA OPCIÓN
 //       if (numero % 2 == 0) 
  //      {
//
  //          if (numero % 3 == 0)
 //           {System.out.println("Numero par y dibisible entre 3");
            
 //           }
  //          else{System.out.println("Numero par");}
  //      }
              
   //     else 
   //     {System.out.println("Numero impar");}

        
        
        
    }

}

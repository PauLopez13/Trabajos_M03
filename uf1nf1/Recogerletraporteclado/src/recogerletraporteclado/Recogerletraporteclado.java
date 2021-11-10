/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recogerletraporteclado;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Recogerletraporteclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("ERES MAYOR DE EDAD? (s/n)");   
        char mayorEdad;
        int dinero;
        mayorEdad = teclado.nextLine().charAt(0); 
      
//recoge la frase que pongas pero recoge la letra que está en primera posición
        System.out.println("has escogido " + mayorEdad);
        System.out.println("Cuanto dinero tienes? Pon solo euros sin centimos");
        dinero = teclado.nextInt();
        // or = ||
        // and = &&
        if((mayorEdad== 's' || mayorEdad=='S') && (dinero>=10)) //comillas simples cuando quieras poner solo en letras
        {
        System.out.println("van 4 y se cae tu hermana");
        }
        
        else if (mayorEdad=='n' || mayorEdad=='N')
        {
        System.out.println("van 2 y se cae el del medio");
        }
        
        else
        {
            System.out.println("A VER SUBNORMAL, QUE PONGAS s O n PESAO");
        } 
// TODO code application logic here
    }
    
}

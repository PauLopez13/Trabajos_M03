/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forejercicio10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Forejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nota;
        boolean hay10 = false;
        int contnotas=0;
        int notamedia=0;
        int notafinal=0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las notas=");
        
        do {
            nota = teclado.nextInt();
            
            if (nota != -1)
            {
            contnotas++;
            notamedia = notamedia+nota;

            }
                
            if(nota == 10)
            {
            hay10 = true;
            }
            
            
            
        } while (nota != -1);
        
        notafinal =notamedia/contnotas;
        
        if (hay10 == true)
        {
            System.out.println("Hay algún diez :)");
        }
        else 
        {
            System.out.println("no hay ningún 10");
        }
        System.out.println("Hay = " + contnotas + "notas");

        System.out.println("La nota media és: " + notafinal);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12for;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio12For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int A;
        int B;
        int cont;
        int resultado=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que numero Quieres elevar?");
        A = teclado.nextInt();
        System.out.println("Que Elevación quieres calcular?");
        B = teclado.nextInt();
        
        for (cont=1; cont<=B; cont++) {
            
            resultado = resultado*A;
            System.out.println("resultado " + resultado);
            
        }
        System.out.println("El resultado es: " + resultado);
        

    }

}

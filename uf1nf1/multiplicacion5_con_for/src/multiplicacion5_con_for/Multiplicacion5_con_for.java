/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacion5_con_for;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Multiplicacion5_con_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cont;
        int producto;
        int tabla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que numero de la tabla quieres?");
        tabla = teclado.nextInt();

        System.out.println("for =");
        for (cont = 1; cont <= 10; cont++) {
            System.out.println(tabla + "*" + cont + "=" + tabla * cont);

        }

        cont = 1;
        int multi;
        System.out.println("while = ");
        
        
        while (cont <= 10) {
            multi = tabla * cont;
            System.out.println(tabla + "*" + cont + "=" + multi);
            cont = cont + 1;

        }
        System.out.println("do =");
        do {
            multi = tabla * cont;
            System.out.println(tabla + "*" + cont + "=" + multi);
            cont = cont+1;
        }while(cont<=10);
       

    
    }

}

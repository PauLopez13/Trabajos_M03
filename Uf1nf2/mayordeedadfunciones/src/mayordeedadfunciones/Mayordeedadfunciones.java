/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayordeedadfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Mayordeedadfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        edad = mostraredad();

    }

    public static int mostraredad() {

        Scanner sc = new Scanner(System.in);
        int valor;
        do{
        System.out.println("Indica tu edad:");
        valor = sc.nextInt();
        if (valor < 18)
        {
            System.out.println("Eres menor de edad");
        }
        else if (valor >= 18)
        {
            System.out.println("Eres mayor de edad");
        }
        
        
        System.out.println(valor);

        }while(valor<=0);
        return valor;

    }


        

    

}

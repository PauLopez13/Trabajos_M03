/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesdevuelvenvalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Funcionesdevuelvenvalores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor y lo doblaré por 2, luego el resultado lo multiplicaré por 3");
        int numero = sc.nextInt();
        
        int Valordoble = doblarnumero(numero);
        var Valortriple = triplenumero(Valordoble);
        System.out.println("numero " + numero + " Valordoble " + Valordoble);  
        System.out.println("Y el triple será = " +  Valortriple);
            }
    
    /**
     * 
     * @param valor
     * @return 
     */
    
    public static int doblarnumero(int valor)
    {
        int doble = valor * 2;
        return doble;//El return doble te devuelve solo el valor que tenga el return, en este caso doble

    }
    /**
     * 
     * @param valor
     * @return 
     */
    public static int triplenumero(int valor)
    {
    int triple = valor * 3;
    return triple;
            
    }

}

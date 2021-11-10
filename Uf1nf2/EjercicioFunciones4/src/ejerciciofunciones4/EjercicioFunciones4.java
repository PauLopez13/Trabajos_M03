/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofunciones4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioFunciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int numero1;
int dimesigno;
        System.out.println("indica tu numero:");
        numero1=sc.nextInt();

        
        dimesigno = positivoonegativo(numero1);
        System.out.println("Tu resultado és(1 = positivo, 0 = igual a 0, -1 = negativo) RESULTADO= " + dimesigno );
    }
    
    
    public static int positivoonegativo(int numero1)
    {
    int respuesta;
    
    if (numero1 > 0)
    {
    respuesta = 1;
    }
    else if (numero1<0)
    {
    respuesta = -1;
    }
    else {
    respuesta = 0;
    }    
        
        return respuesta;
    
    }
    
    
}

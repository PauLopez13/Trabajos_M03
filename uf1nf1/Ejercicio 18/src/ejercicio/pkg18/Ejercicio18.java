/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double numhoras;
        String nombre;
        double tarifanormal;
        double salariobruto;
        double salarioneto;
        double tasas;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el numero de horas porfavor:");
        numhoras = teclado.nextDouble();
        System.out.println("El numero de horas és: " + numhoras);
        System.out.println("Introduce tu nombre:");
        nombre = teclado.next();
        System.out.println("Tu nombre és : " + nombre);

        System.out.println("Indique la tarifa normal por hora por favor: ");
        tarifanormal = teclado.nextDouble();
        System.out.println("La tarifa normal és: " + tarifanormal);

        if (numhoras < 35) {
            salariobruto = numhoras * tarifanormal;

        } else {
            salariobruto = (numhoras - 35) * tarifanormal * 1.5 + 35 * tarifanormal;
        }
        System.out.println("El salario bruto seria de: " + salariobruto);

        
        /////IMPUESTOS
        
        if (salariobruto < 500) {
            tasas = 0;
        } 
        
        else if (salariobruto < 900) {
            tasas = (900 - salariobruto) * 0.25;
        } 
        
        else {

            tasas = 900 * 0.25 + (salariobruto - 900) * 0.45;
        }
        
        
        salarioneto = salariobruto - tasas;
        System.out.println("El salario Neto és = " + salarioneto);

        System.out.println("Las tasas són de = " + tasas);

        System.out.println("El nombre és = " + nombre);

            
            
            
    }

}

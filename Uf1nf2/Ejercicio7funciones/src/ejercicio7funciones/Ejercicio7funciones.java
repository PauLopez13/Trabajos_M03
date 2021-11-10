/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio7funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double ladoancho, ladoalto;
double arearesultado;
double area, perimetro;
        System.out.println("Indique su lado ancho:");
        ladoancho = sc.nextDouble();
        System.out.println("Ahora indique su lado alto:");
        ladoalto = sc.nextDouble();

        area = arearesultado(ladoancho, ladoalto);
        perimetro = perimetrorectangulo(ladoancho, ladoalto);
        
        System.out.println("La area és = " + area);
        System.out.println("El perimetro és =" + perimetro);
    }

    private static double arearesultado(double ladoancho, double ladoalto) {
        
        double resultado;
        
        resultado = ladoancho * ladoalto;
        return resultado;
        
    }

    private static double perimetrorectangulo(double ladoancho, double ladoalto) {

        double resultado;
        
        resultado = ladoancho + ladoancho + ladoalto + ladoalto;
        
        return resultado;

        
    }
    
}

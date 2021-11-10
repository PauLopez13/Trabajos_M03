/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosumafor;

/**
 *
 * @author alumne
 */
public class Ejerciciosumafor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero=1, Acumulativosuma10=0, producto10=1;

        
        for (numero=1;numero<=10; numero++) {
                   
            Acumulativosuma10 = Acumulativosuma10+numero;
            producto10= producto10*numero;
        }
        
        
        
        
        System.out.println("La suma total és= " + Acumulativosuma10);
        System.out.println("El producto total és= " + producto10);
        
    }
    
}

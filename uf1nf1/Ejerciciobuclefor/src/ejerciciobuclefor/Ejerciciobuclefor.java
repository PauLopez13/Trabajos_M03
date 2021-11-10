/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobuclefor;

/**
 *
 * @author alumne
 */
public class Ejerciciobuclefor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cont;
        
        //v.inicial;     v.final
        for (cont = 0; cont < 6; cont++) {
            System.out.println("numero = " + cont);
        }
        System.out.println("El del while");
        while (cont <= 5)
        {
        System.out.println("numero = " + cont);
        cont = cont + 1;
                    }   
        
        System.out.println("el del do");
        do{
        
            System.out.println("numero = " + cont);
            cont++;
        }while (cont<6);
        
        
        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asciiejercicio;

/**
 *
 * @author alumne
 */
public class Asciiejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char letra = 'D';
        int ascii;
        for (letra = 'A'; letra <= 'Z'; letra++) {
            ascii = (int) letra;
            System.out.println(letra + " En ascii és = " + ascii);
        }

    }

}

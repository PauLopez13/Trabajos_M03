/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no_pensar_funciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NO_pensar_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        int tijeras, piedra, papel, num = 0, numrandom = 0;
        int tirar_ordenador, elegir_usuario, comprovar_ganador, contador=0, contadorj, contadorm;
        boolean seguirjugando;
        
        do{
        contador = contadorfuncion(contador);

        elegir_usuario = usuarioelección(num);
        jugadajugador(elegir_usuario);

        tirar_ordenador = randomnum(numrandom);
        jugadamaquina(tirar_ordenador);
       
        comprovar_ganador = operacionganador(elegir_usuario, tirar_ordenador);
    
        seguirjugando=seguir_jugando(0,0);

        if (comprovar_ganador == 1) {
            System.out.println("HAS GANADO!!");
        } else if (comprovar_ganador == 0) {
            System.out.println("Has perdido...");
        } else if (comprovar_ganador == -1) {
            System.out.println("Habeis quedado empate, volver a intentarlo");
        }

        }while(contador != 5);
        System.out.println("Ya llevas 5 jugadas. ");
    }

    private static int randomnum(int numrandom) {
        Random r = new Random();

        int numeror = r.nextInt(3) + 1;

        return numeror;

    }

    private static int usuarioelección(int num) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Eliga su elección");
            System.out.println("Tijera = 1");
            System.out.println("Piedra = 2");
            System.out.println("Papel = 3");
            numero = teclado.nextInt();

        } while (numero != 1 && numero != 2 && numero != 3);

        return numero;
    }

    private static int operacionganador(int elegir_usuario, int tirar_ordenador) {

        if ((elegir_usuario == 1 && tirar_ordenador == 3) || (elegir_usuario == 2 && tirar_ordenador == 1) || (elegir_usuario == 3 && tirar_ordenador == 2)) {
            return 1;
        } else if ((elegir_usuario == 1 && tirar_ordenador == 2) || (elegir_usuario == 2 && tirar_ordenador == 3) || (elegir_usuario == 3 && tirar_ordenador == 1)) {
            return 0;
        } else {
            return -1;
        }

    }

    private static int contadorfuncion(int contador) {

        contador = contador + 1;
            
        return contador;
    }

    private static void jugadajugador(int elegir_usuario) {

        if (elegir_usuario == 1) {
            System.out.println("Has sacado tijeras");
        } else if (elegir_usuario == 2) {
            System.out.println("Has sacado piedra");
        } else if (elegir_usuario == 3) {
            System.out.println("Has sacado papel");
        }
    }

    private static void jugadamaquina(int tirar_ordenador) {

      if (tirar_ordenador == 1)  
      {
          System.out.println("El ordenador ha sacado TIJERAS!!");
      }
      else if(tirar_ordenador == 2)
      {
          System.out.println("El ordenador ha sacado PIEDRA!!");
      }
      else if (tirar_ordenador == 3)
      {
          System.out.println("El ordenador ha sacado PAPEL!!");
      }


    }

    private static boolean seguir_jugando(int contadorj, int contadorm) {
        boolean seguir = true;
        if (contadorj >=5 ||contadorm >=5)
        {
        return false;
        }
        else{
        return true;
        }
        

    }
    

}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.de.dados;

/**
 *
 * @author labing506
 */
public class Mensaje {

    public Mensaje() {
    }

int menuPrincipal(){
            
    Dado1 midado1 = new Dado1();
    Dado2 midado2 = new Dado2();

    Public int opcion = new Mensaje();
    
    opcion = midado1 + midado2;
    
        switch (opcion){
            
            case 2:
                System.out.println("Pierde la apuesta" );
            case 3:
                System.out.println("Pierde el doble" );
            case 7:
                System.out.println("gana el  doble" );
            case 11:
                System.out.println("No pierde nada" );
            case 12:
                System.out.println("Gana la Apuesta" );
            break;
                System.out.println("Pierde el 1.5 de la apuesta" );
    }
}

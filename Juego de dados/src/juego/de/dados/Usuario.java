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
public class Usuario {
    
    public int apuesta;
    public int billetera = 1000000000;
       
    
    public float getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public float getBilletera() {
        return billetera;
    }

    public void setBilletera(int billetera) {
        this.billetera = billetera;
}
        
    Random Dado1 = new random ();
    Random Dado2 = new random ();
    
    int Lanzar () {
        return Dado1+Dado2;
        
}
    
}

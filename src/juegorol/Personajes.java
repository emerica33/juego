/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegorol;

import java.util.Random;
import javafx.fxml.FXML;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */



public class Personajes {
    int vida = 100, maxPower, minPower;
    String nombre;
    Random x = new Random();
    

    
    
    public Personajes() {
        this.maxPower = x.nextInt(20);
        this.minPower = x.nextInt(10);
       
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int atacar (){
        return x.nextInt(10);
       
    }
    
    
    
    
    
}

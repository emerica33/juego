/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegorol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;
import juegorol.Personajes;
/**
 *
 * @author gabri
 */
public class FXMLDocumentController extends Personajes implements Initializable  {
    
    private Label label;

    @FXML
    private Label lblVidaP1;
    @FXML
    private Label lblVidaP2;
    @FXML
    private Button btnAtacarp1;
    @FXML
    private Button btnAtacarp2;
    
    
   
    @FXML
    private Label lblNombreP1;
    @FXML
    private Label lblMinPowerP1;
    @FXML
    private Label lblMaxPowerP1;
    @FXML
    private Label lblNombreP2;
    @FXML
    private Label lblMinPowerP2;
    @FXML
    private Label lblMaxPowerP2;
    
   
      Personajes P1 = new Personajes();
      Personajes P2 = new Personajes();
    @FXML
    private Label lblganador;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //<editor-fold defaultstate="collapsed" desc="P1">
        P1.nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del primer personaje:");
        lblNombreP1.setText(P1.nombre);
            while (P1.nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para el primer personaje.");
             P1.nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del primer personaje:");
             lblNombreP1.setText(P1.nombre);
            }

        lblMinPowerP1.setText(String.valueOf(P1.minPower));
        lblMaxPowerP1.setText(String.valueOf(P1.maxPower));
        lblVidaP1.setText(String.valueOf(P1.vida));
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="P2">
        P2.nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del segundo personaje:");
        lblNombreP2.setText(P2.nombre);
            while (P2.nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para el segundo personaje.");
            P2.nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del segundo personaje:");
            lblNombreP2.setText(P2.nombre);
            }
        
        lblMaxPowerP2.setText(String.valueOf(P2.maxPower));
        lblMinPowerP2.setText(String.valueOf(P2.minPower));
        lblVidaP2.setText(String.valueOf(P2.vida));
        
        
    }   
//</editor-fold>
        
        
 

    @FXML
    private void Clicked_btnAtacarp1(MouseEvent event) {
      int p1Ataque = P1.atacar()+P1.maxPower;
      P2.vida-=p1Ataque;
      lblVidaP2.setText(String.valueOf(P2.vida));
        
        if (P2.vida<=0) {
            lblVidaP2.setText("Jugador 1 ha ganado.");
            this.btnAtacarp2.setDisable(true);
        }
         Cerrar();
    }

    @FXML
    private void Clicked_btnAtacarp2(MouseEvent event) {
      int p2Ataque = P2.atacar()+P2.maxPower;
      P1.vida-=p2Ataque;
      lblVidaP1.setText(String.valueOf(P1.vida));
        
        if (P1.vida<=0) {
            lblVidaP1.setText("Jugador 2 ha ganado.");
           this.btnAtacarp1.setDisable(true);  
        }
        Cerrar();
    }

    public void Cerrar (){
                          if (P1.vida <=0 || P2.vida <=0) {
                  JOptionPane.showMessageDialog(null, "Gracias por jugar");
                  System.exit(0);
            
        }
    
    }
    
    
    
    
    }
    
    
    
    


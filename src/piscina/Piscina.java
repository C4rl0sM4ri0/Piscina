/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piscina;
import javax.swing.*;
/**
 *
 * @author Carlos Hack
 */

public class Piscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Codigo obj = new Codigo();
      ventana_empresa ventana= new ventana_empresa();
      ventana.setVisible(true);
      ventana.setResizable(false);
      ventana.setLocationRelativeTo(null);    
     
    }   

}



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
public class Codigo {
    
   private final int bulto_arena;
   private final int bulto_gravilla;
   private final int bulto_cemento;
   private final int mano_obra;
   private final int baldosa_metro_cuad;
   private final int pegante_3bald_metro_cuad;
   private final int  mano_obra_baldosas;
   private final int agua_metro_cub;
   private final int quimico_agua;
   private int ancho;
   private int largo;
   private int profundidad;
   private final double grosor_piso;
   private final double grosor_paredes;
   
   public Codigo(){
        
    bulto_arena=3000;
    bulto_gravilla=5000;
    bulto_cemento=20000;
    mano_obra=10000;
    baldosa_metro_cuad=10000;
    pegante_3bald_metro_cuad=7500;
    mano_obra_baldosas=15000;
    agua_metro_cub=5000;
    quimico_agua=17000;
    largo=0;
    ancho=0;
    profundidad=0;
    grosor_piso=0.25;
    grosor_paredes=0.10;
   
   }


    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * @return the profundidad
     */
    public int getProfundidad() {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    
    public double Area(){
        double area;
        area=(getLargo()* getAncho());
        
        return area;
    }

    public double Volumen(){
        double volumen;
        volumen=(getLargo()*getAncho()*getProfundidad());
        
        return volumen;
    }
  
    
    public double Calculosm3Concreto(){
        double finalm3;
        double bultoArena;
        double bultoGravilla;
        double bultoCemento;
        double manoObra;
       
        
         bultoArena=(2*bulto_arena*Volumen());
         bultoGravilla=(3*bulto_gravilla*Volumen());
         bultoCemento=(bulto_cemento*Volumen());
         manoObra=(mano_obra*Volumen());

         finalm3=(bultoArena+bultoGravilla+bultoCemento+manoObra);

     return finalm3;  
    }
    
        public double Calculosm2Baldosa(){
        double finalm2;
        double baldosam2;
        double pegante;
        double manoObraBaldosa;
        
        
        
         baldosam2=(baldosa_metro_cuad*Area());
         pegante=(pegante_3bald_metro_cuad*Area());
         manoObraBaldosa=(mano_obra_baldosas*Area());

         finalm2=(baldosam2+pegante+manoObraBaldosa);

     return finalm2;  
    }
        
    public double GastosAgua(){
        double valorF;
        double agua;
        double quimicos;
        agua=(agua_metro_cub*Volumen());
        quimicos=(quimico_agua*Volumen());
        valorF=(agua+quimicos);
        
        
        return valorF;
    }
    
    
}

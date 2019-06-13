/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author ISTLOJA V
 */
public class computador {
 //declaro atrivitos   
   private int año;
   private String modelo;
   private String marca;
   private double capacidadprocesador;
   private boolean portatil;
   //declaro metodo
   public void guardarinformacion(){
       System.out.println("hola soy una conputadora y guarde informacion");
   }
   public void leerinformacion(){
       System.out.println("hola soy conputadora y leo informacion");
      computador primerobjeto=new computador();//he creado mi primer objeto
      primerobjeto.leerinformacion();
   }

    void imprimirinformacion(String hola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    }
    


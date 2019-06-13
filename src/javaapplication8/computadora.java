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
public class computadora {
    //declaro atrivitos  
   //declaro metodo//declaro atrivitos   
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
      {
   public void guardarinformacion(){
       System.out.println("hola soy una conputadora y guarde informacion");
   }
   public void leerinformacion(){
       System.out.println("hola soy conputadora y leo informacion");
   }
   public void imprimirinformacion (String info){
       System.out.println(info);
   }
    public static void main(String[] args) {
     computador primerobjeto=new computador();//he creado mi primer objeto
     primerobjeto.leerinformacion();//llama aun metodo
     primerobjeto.imprimirinformacion("hola");
     primerobjeto.imprimirinformacion("chao");
   }
   
    }
    


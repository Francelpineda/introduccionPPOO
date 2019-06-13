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
public class tienda { 
   private int tamaño;
   private String modelo;
   private String diseño;
   private double capacidad;
   
   public void registrarventa(){
       System.out.println("hola soy la computadora y  registro tus mejores  ventas");
   }
   public void entregarfactura(){
       System.out.println("hola soy la computadora y esta es tu factura de las ventas");
   }
   public void entregarproducto(){
       System.out.println("hola soy la computadora y te digo cuantos productos entregado");
   }
 public static void main(String[] args) {
     tienda primerobjeto=new tienda();
     primerobjeto.registrarventa();
   
}
}
    


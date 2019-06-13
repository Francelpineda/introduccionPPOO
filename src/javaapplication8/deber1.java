/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA V
 */
public class deber1 {
     public static void main(String []args){
        String[][] ciudades = new String[4][3];
        String[] países = new String[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el nombre de cuatro países.");
        int i=0; int j=0;
        for(i=0;i<4;i++){
            países[i] = scan.nextLine();
        }
        for(i=0;i<4;i++){
            System.out.println("Introduzca tres ciudades de "+países[i]+".");
            for(j=0;j<3;j++){
                ciudades[i][j] = scan.nextLine();
            }
        }
        System.out.print("\nLos países y ciudades intoducidos son los siguientes: \n");
        for(i=0;i<4;i++){
            System.out.print("\n"+países[i]+": \t");
            for(j=0;j<3;j++){
                System.out.print(ciudades[i][j]+"\t");
            }
        }
    }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-102
 */
public class Primero {
    public static void main(String[] args) {
        //arreglos no mutables

        int x[]={5,-2,6};
        
        //para obtener un elemento del arreglo
        //usamos
        System.out.println(x[0]);
        
       //todos los arreglos no mutables tinen una propiedad para saber el tamaño
        System.out.println(x.length);
        
        //vamos a iterar el arreglo con un ciclo for
        for (int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
        
        for(int a:x)
        {
            System.out.println(a);
        }
        }

    
    
}

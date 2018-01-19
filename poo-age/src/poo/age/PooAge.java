/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.age;

/**
 *
 * @author T-102
 */
public class PooAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Hola mundo");
        
        //Tenemos que generar los objetos de las clases anteriores
        
        Usuario x=new Usuario();
        x.altura =1.61f;
        x.peso=45f;
        Imc algo=new Imc();
        algo.u=x;
        
        //calculamos imc a traves de su objeto
        
        System.out.println(algo.calcular());
  
        
        
    }
    
}

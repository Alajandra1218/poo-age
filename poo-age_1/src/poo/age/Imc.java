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
public class Imc {
    //el siguiente atributo es de tipo composición-agregación
    Usuario u;
    
    public String calcular(){
        
        float imc=u.getPeso()/(u.getAltura() * u.getAltura());
     
        return "Tu IMC es: "+imc;
    }
    
    
}

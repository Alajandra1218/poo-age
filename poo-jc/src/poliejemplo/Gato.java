/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

/**
 *
 * @author juan_
 */
public class Gato extends Animal implements ComportamienoAnimal{

    @Override
    public void hacerRuido() {
        System.out.println("miau-miau-miau");
    }
    
}

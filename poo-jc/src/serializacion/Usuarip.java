/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;
import java.io.*;
public class Usuarip  implements Serializable{
    private int edad;
    private String nombre;

   
     public Usuarip() {
    }

    public Usuarip(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    
    
    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
}

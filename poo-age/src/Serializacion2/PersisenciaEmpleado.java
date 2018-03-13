/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion2;
import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import serializacion.Usuario;

/**
 *
 * @author T-102
 */

public class PersisenciaEmpleado {
    ArrayList<Empleado> empleados;
    //Generamos el metodo para serializar a nuestro usuario
    private Usuario u;

    public PersisenciaEmpleado() {
    empleados=new ArrayList<>();
    }

    public void guardar(Empleado e) {

        //Para serializar el primer paso es generar el archvio fisico donde 
        //estara nuestro obejto de tipo usuario
        File file = new File("empleados.yo");
        if(file.exists())
        {
            empleados= buscarTodos();
        }
        //Desepues lo abrimos para escrcibir sobre el
        try {
            FileOutputStream fos = new FileOutputStream(file);
       //Luego seriaalizamos
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //Guardamos nuestro usuario!!
       empleados.add(e);
       oos.writeObject(empleados); 
       //Ponemos un mensajito
            System.out.println("Objeto guardado con exito!!");
       
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

  public ArrayList<Empleado> buscarTodos(){
          File file = new File("empleados.yo");
  try{
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
      empleados = (ArrayList<Empleado>) ois.readObject();
        }catch(Exception ex){
            
        }
  return empleados;
  
  }
  
    
   
}

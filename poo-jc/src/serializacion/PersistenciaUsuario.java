/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
public class PersistenciaUsuario {
    Usuarip u;
    //generamos el metodo para serializar a nuestr usuario
public void guardar() 
{
    //para serializar el  primer paso es generar el archivo fisico donde esta nuestro objeto 
    //tipo usuario
    File file=new File("archivaldo.yo");
    //despues lo abrimos para escribir sobre el
    try{
    FileOutputStream fos=new FileOutputStream(file);
 ObjectOutputStream oos= new ObjectOutputStream(fos);
 oos.writeObject(u);
 //guardamos nuestro usuario
 
    }
    catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
    
    public Usuarip getU() {
        return u;
    }

    public void setU(Usuarip u) {
        this.u = u;
    }
    
}

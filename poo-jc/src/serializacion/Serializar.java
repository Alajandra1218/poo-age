
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;

/**
 *
 * @author T-102
 */
public interface Serializar {
 public  static void main (String [] args)
 {
     Usuarip u=new Usuarip(20,"PEDRO");
     PersistenciaUsuario p=new PersistenciaUsuario();
     p.setU(u);
     p.guardar();
     
 }
}

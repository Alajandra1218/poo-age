/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
public class Serializar {
    public static void main(String[] args) {
        
        //Primero generamos un Usuario
        Usuario u=new Usuario(20, "Pedro");
        
        //Generamos un modelo de  la clase que serialzia
        PersistenciaUsuario p=new PersistenciaUsuario();
        //Ajutamos su atributo usuario
        p.setU(u);
        
        //Ahora si comprimimos
        p.guardar();
        
    }
}
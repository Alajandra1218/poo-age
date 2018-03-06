/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solexamen;

import java.util.ArrayList;


public class ProbarNominas {
    public static void main(String[] args) {
        
      Trabajador t1=new NominaHonorarios();
      t1.setNombre("Juan");
      t1.setHorasLaboradas(40);
      
      Trabajador t2=new NominaProyecto();
       t2.setNombre("Pedro");
      t2.setHorasLaboradas(20);
      
      
      Trabajador t3=new NominaPlanta();
       t3.setNombre("Ana");
      t3.setHorasLaboradas(100);
      
      ArrayList<Trabajador> trabajadores=new ArrayList<>();
      trabajadores.add(t1);
      trabajadores.add(t2);
      trabajadores.add(t3);
      
      ServicioNomina servicio=new ServicioNomina();
      
      
      for(Trabajador t: trabajadores){
          servicio.pagarNomina((PagoNomina) t);
      }
      
      
      
      
      
      trabajadores.forEach((t) -> {
          servicio.pagarNomina((PagoNomina) t);
        });
         
    }
}

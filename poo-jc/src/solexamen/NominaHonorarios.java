/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solexamen;

/**
 *
 * @author campitos
 */
public class NominaHonorarios extends Trabajador implements PagoNomina{

    @Override
    public void pagarNomina() {
        
        
        System.out.println("nomina honorarios "+getHorasLaboradas()*(1+getHorasLaboradas()*0.16f)*250 +" para "+getNombre());
    }
    
}

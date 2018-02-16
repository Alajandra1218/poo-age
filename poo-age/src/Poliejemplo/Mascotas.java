 */
package Poliejemplo;

import java.util.*;

/**
 *
 * @author T-102
 */
public class Mascotas {
    public static void main(String[] args) {
        Animal  animales[]=new Animal[12];
        //primero generamos tres gatos
        animales[0]=new Gato();
        animales[1]=new Gato();
        animales[2]=new Gato();
        
        
        //generamos los perros
        animales[3]=new Perro();
        animales[4]=new Perro();
     
        
        //gemeramos los pollos
        
         animales[5]=new Pollo();
         animales[6]=new Pollo();
         animales[7]=new Pollo();
         animales[8]=new Pollo();
         animales[9]=new Pollo();
         
         //generemos ratones
         
         animales[10]=new Ratón();
         animales[11]=new Ratón();
   
               ServicioAnimales s=new ServicioAnimales();
               for(Animal a : animales)
               {
                 s.servicioHacerRuido((ComportamientoAnimal)a);
               }
    
         //vamos a generar un ArrayList y poner alli algunos animalitos
   
               
               ArrayList<Animal> animalitos=new ArrayList<>();
    animalitos.add(new Pollo());
    animalitos.add(new Ratón ());
    animalitos.add(new Perro ());
    animalitos.add(new Pollo());
     animalitos.add(new Gato ());
     for(Animal a : animalitos)
               {
                 s.servicioHacerRuido((ComportamientoAnimal)a);
               }
    
    animalitos.get(0).setEdad(1);
        System.out.println(animalitos.get(0).getEdad());
    }


}

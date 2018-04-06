/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
//segunda forma de crear:implementando la intefac runnable
public class probarthead implements Runnable{
    public static void main(String[] args) {
        tareaz t1=new tareaz();
        tareaz t2=new tareaz();
        Runnable r=new probarthead();
        Thread t3=new Thread(r);
        //inicializar
        t1.setName("nombre");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
    
      while(true){  
      LocalTime tiempo=LocalTime.now();
        int hora=tiempo.getHour();
        int minuto=tiempo.getMinute();
        int segundo=tiempo.getSecond();
        System.out.println("la hora es: "+hora+":"+minuto+":"+segundo);
        try{
            Thread.sleep(1000);
            
        } catch (InterruptedException ex) {
              Logger.getLogger(probarthead.class.getName()).log(Level.SEVERE, null, ex);
          }
     
      
      }
        
      }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author T-102
 */
public class tareaz extends Thread{

    @Override
    public void run() {
        System.out.println("soy un thead muy sencillito"+"y me llamo"+Thread.currentThread().getName());
    }
    
}

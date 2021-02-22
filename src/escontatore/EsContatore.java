/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escontatore;

/**
 *
 * @author Giorgio Del Rocca
 */
public class EsContatore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i=5;
        Runnable run1=new Decremento(i);
        Runnable run2=new Incremento(i);
        Thread thr1= new Thread(run1);
        Thread thr2= new Thread(run2);
        thr1.start();
        thr2.start();
    }
    
}
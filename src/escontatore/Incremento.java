package escontatore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giorgio Del Rocca
 */
public class Incremento implements Runnable{
    int i;
    
    public Incremento(int i){
        this.i=i;
    }
    
    @Override
    public void run(){
        while (1 == 1) {
            if (i < 100) {
                System.out.println(i++);
            }
        }
    }
}
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
public class Decremento implements Runnable {

    private Integer i;

    public Decremento(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (1 == 1) {
            if (i > 0) {
                System.out.println(i--);
            }
        }
    }
}
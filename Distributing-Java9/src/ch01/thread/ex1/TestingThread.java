/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01.thread.ex1;

/**
 *
 * @author barcvilla
 */
public class TestingThread {
    
    public static void main(String[] args) {
        Thread t1 = new NewThread();
        t1.start();
    }
    
}

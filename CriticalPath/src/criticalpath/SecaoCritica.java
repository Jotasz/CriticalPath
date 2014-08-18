/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package criticalpath;

/**
 *
 * @author Julio
 */
public class SecaoCritica {
    public int size;
    public int count = 100;
    
    public SecaoCritica(int size){
        this.size = size;
    }
    
    public synchronized void fastcsec(){
        try {
            long inicio = System.nanoTime()/1000000;
            Thread.sleep(200-count);
            long fim = System.nanoTime()/1000000;
            System.out.println(Thread.currentThread().getName()+" Demorou "+(fim-inicio)+""
                + " Milissegundos para executar");
        } catch (InterruptedException ex) {
            System.out.println("Thread interrompida.");
        }
        count -= 2;
    }
    
    
    public synchronized void slowcsec(){
        try {
            long inicio = System.nanoTime()/1000000;
            Thread.sleep(200);
            long fim = System.nanoTime()/1000000;
            System.out.println(Thread.currentThread().getName()+" Demorou "+(fim-inicio)+""
                + " Milissegundos para executar");
        } catch (InterruptedException ex) {
            System.out.println("Thread interrompida.");
        }
    }
}

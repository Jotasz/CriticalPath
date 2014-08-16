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
public class CriticalPath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecaoCritica sc = new SecaoCritica(1000);
        /*Aqui tenho que criar algumas threads*/
        ThreadCriticalSection t1 = new ThreadCriticalSection(sc);
        ThreadCriticalSection t2 = new ThreadCriticalSection(sc);
        t1.start();
        t2.start();
        /*Medir o tempo de execução de cada thread.*/
    }
    
}

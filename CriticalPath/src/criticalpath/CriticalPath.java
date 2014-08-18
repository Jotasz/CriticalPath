/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package criticalpath;

import java.util.ArrayList;

/**
 *
 * @author Julio
 */
public class CriticalPath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ThreadCriticalSection> threadGroup = new ArrayList();
        SecaoCritica sc = new SecaoCritica(10);
        /*Aqui tenho que criar algumas threads*/
        for(int i = 0; i < 50; i++){
            threadGroup.add(new ThreadCriticalSection(sc));
            threadGroup.get(i).start();
        }
        /*Medir o tempo de execução de cada thread.*/
    }
    
}

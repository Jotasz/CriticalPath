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
public class ThreadCriticalSection extends Thread {
    public SecaoCritica sc;
    public long inicio,fim;
    
    public ThreadCriticalSection(SecaoCritica sc){
        this.sc = sc;
    }
    @Override
    public void run(){
        sc.fastcsec();
        //sc.slowcsec();
    }
}

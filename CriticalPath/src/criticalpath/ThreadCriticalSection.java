/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package criticalpath;

import java.util.Calendar;

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
        Calendar cal = Calendar.getInstance();
        inicio = cal.getTimeInMillis();
        sc.csec();
        fim = cal.getTimeInMillis();
        System.out.println(Thread.currentThread().getName()+" Demorou "+(fim-inicio)+""
                + " Milissegundos para executar");
    }
}

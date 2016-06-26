package chapter1.localThreadVariables;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class UnsafeTask implements Runnable {

    private Date startDate;

    public void run() {
        startDate=new Date();
        System.out.printf("Starting Thread: %s : %s\n",Thread.currentThread().getId(),startDate);
        try {
            TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread Finished: %s : %s\n",Thread.currentThread().getId(),startDate);
    }
}

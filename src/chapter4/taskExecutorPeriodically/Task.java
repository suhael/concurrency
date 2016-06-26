package chapter4.taskExecutorPeriodically;

import java.util.Date;

/**
 * Created by sakhtar on 26/08/2014.
 */
public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name=name;
    }

    public void run() {
        System.out.printf("%s: Starting at : %s\n",name,new Date());
    }
}

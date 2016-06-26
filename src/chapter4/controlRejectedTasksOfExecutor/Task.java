package chapter4.controlRejectedTasksOfExecutor;

import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 28/08/2014.
 */
public class Task implements Runnable {
    private String name;

    public Task(String name){
        this.name=name;
    }

    public void run() {
        System.out.println("Task "+name+": Starting");
        try {
            long duration=(long)(Math.random()*10);
            System.out.printf("Task %s: ReportGenerator: Generating a report during %d seconds\n",name,duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Task %s: Ending\n",name);
    }

    public String toString() {
        return this.name;
    }
}

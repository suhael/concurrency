package chapter1.sleepAndResume;

import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class FileMain {
    public static void main(String[] args) {
        FileClock clock=new FileClock();
        Thread thread=new Thread(clock);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        thread.interrupt();
    }
}

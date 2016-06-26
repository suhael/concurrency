package chapter1.threadFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class Task implements Runnable {
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

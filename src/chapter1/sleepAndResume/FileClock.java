package chapter1.sleepAndResume;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class FileClock implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\n", new Date());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.printf("The FileClock has been interrupted");
            }
        }
    }
}

package chapter2.multipleConditionsLock;

import java.util.Random;

/**
 * Created by sakhtar on 04/07/2014.
 */
public class Consumer implements Runnable {
    private Buffer buffer;
    public Consumer (Buffer buffer) {
        this.buffer=buffer;
    }

    public void run() {
        while (buffer.hasPendingLines()) {
            String line=buffer.get();
            processLine(line);
        }
    }

    private void processLine(String line) {
        try {
            Random random=new Random();
            Thread.sleep(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

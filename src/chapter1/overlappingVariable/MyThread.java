package chapter1.overlappingVariable;

import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class MyThread implements Runnable {

    private int value;

    @Override
    public void run() {
        for(int i=1; i<10;i++){
            System.out.printf("%s: The value was %d and now it is %d \n", Thread.currentThread().getName(), value, ++value);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

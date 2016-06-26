package chapter1.uncontrolledExceptionsInThreadGroups;

import java.util.Random;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class Task implements Runnable {
    public void run() {
        int result = 0;
        Random random=new Random(Thread.currentThread().getId());
        while (true) {
            result=1000/((int)(random.nextDouble()*1000));
            System.out.printf("%s : %d \n",Thread.currentThread().getId(),result);
            if (Thread.currentThread().isInterrupted()) {
                System.out.printf("%d : Interrupted \n",Thread.currentThread().getId());
                return;
            }
        }
    }
}

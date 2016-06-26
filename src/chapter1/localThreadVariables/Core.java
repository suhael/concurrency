package chapter1.localThreadVariables;

import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class Core {
    public static void main(String[] args) {
        SafeTask task=new SafeTask();
        for (int i=0; i<10; i++){
            Thread thread=new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

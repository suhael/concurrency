package chapter4.cancelTaskExecutor;

import java.util.concurrent.Callable;

/**
 * Created by sakhtar on 26/08/2014.
 */
public class Task implements Callable<String> {
    public String call() throws Exception {
        while (true){
            System.out.printf("Task: Test\n");
            Thread.sleep(100);
        }
    }
}

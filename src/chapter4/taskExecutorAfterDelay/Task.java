package chapter4.taskExecutorAfterDelay;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by sakhtar on 26/08/2014.
 */
public class Task implements Callable<String> {
    private String name;

    public Task(String name) {
        this.name=name;
    }

    public String call() throws Exception {
        System.out.printf("%s: Starting at : %s\n",name,new Date());
        return "Hello, world";
    }
}

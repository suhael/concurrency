package chapter4.controlTaskFinishing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 27/08/2014.
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executor=(ExecutorService) Executors.newCachedThreadPool();
        ResultTask resultTasks[]=new ResultTask[5];

        for (int i=0; i<5; i++) {
            ExecutableTask executableTask=new ExecutableTask("Task "+i);
            resultTasks[i]=new ResultTask(executableTask);
            executor.submit(resultTasks[i]);
        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        for (int i=0; i<resultTasks.length; i++) {
            resultTasks[i].cancel(true);
        }

        for (int i=0; i<resultTasks.length; i++) {
            try {
                if (!resultTasks[i].isCancelled()){
                    System.out.printf("%s\n",resultTasks[i].get());
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

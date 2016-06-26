package chapter4.controlRejectedTasksOfExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by sakhtar on 28/08/2014.
 */
public class Main {
    public static void main(String[] args) {
        RejectedTaskController controller =new RejectedTaskController();
        ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.setRejectedExecutionHandler(controller);

        System.out.printf("Main: Starting.\n");
        for (int i=0; i<3; i++) {
            Task task=new Task("Task"+i);
            executor.submit(task);
        }

        System.out.printf("Main: Shutting down the Executor.\n");
        executor.shutdown();

        System.out.printf("Main: Sending another Task.\n");
        Task task=new Task("RejectedTask");
        executor.submit(task);

        System.out.println("Main: End");
        System.out.printf("Main: End.\n");


    }
}

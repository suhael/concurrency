package chapter4.controlRejectedTasksOfExecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by sakhtar on 28/08/2014.
 */
public class RejectedTaskController implements RejectedExecutionHandler {

    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.printf("RejectedTaskController: The task %s has been rejected\n",r.toString());
        System.out.printf("RejectedTaskController: %s\n",executor.toString());
        System.out.printf("RejectedTaskController: Terminating: %s\n",executor.isTerminating());
        System.out.printf("RejectedTaksController: Terminated: %s\n",executor.isTerminated());
    }
}

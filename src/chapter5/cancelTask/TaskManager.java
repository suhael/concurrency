package chapter5.cancelTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by sakhtar on 09/09/2014.
 */
public class TaskManager {
    private List<ForkJoinTask<Integer>> tasks;
    public TaskManager(){
        tasks=new ArrayList<>();
    }
    public void addTask(ForkJoinTask<Integer> task){
        tasks.add(task);
    }
    public void cancelTasks(ForkJoinTask<Integer> cancelTask){
        for (ForkJoinTask<Integer> task :tasks) {
            if (task!=cancelTask) {
                task.cancel(true);
                ((SearchNumberTask)task).writeCancelMessage();
            }
        }
    }

}

package chapter4.controlTaskFinishing;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by sakhtar on 27/08/2014.
 */
public class ResultTask extends FutureTask<String> {

    private String name;

    public ResultTask(Callable<String> callable) {
        super(callable);
        this.name=((ExecutableTask)callable).getName();
    }

    protected void done() {
        if (isCancelled()) {
            System.out.printf("%s: Has been canceled\n",name);
        } else {
            System.out.printf("%s: Has finished\n",name);
        }
    }

}

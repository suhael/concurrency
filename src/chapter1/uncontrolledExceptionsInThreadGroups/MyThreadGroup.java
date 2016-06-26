package chapter1.uncontrolledExceptionsInThreadGroups;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class MyThreadGroup extends ThreadGroup{
    public MyThreadGroup(String name) {
        super(name);
    }

    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("The thread %s has thrown an Exception\n",t.getId());
        e.printStackTrace(System.out);
        System.out.printf("Terminating the rest of the Threads\n");
        interrupt();
    }
}

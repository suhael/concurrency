package chapter1.uncontrolledExceptions;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class Main {
    public static void main(String[] args) {
        Task task=new Task();
        Thread thread=new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
    }
}

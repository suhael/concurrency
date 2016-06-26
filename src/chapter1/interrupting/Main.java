package chapter1.interrupting;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class Main {
    public static void main(String[] args) {
        Thread task=new PrimeGenerator();
        task.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.interrupt();
    }
}


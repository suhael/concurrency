package chapter1.overlappingVariable;

/**
 * Created by sakhtar on 19/06/2014.
 */
public class Main {
    public static void main(String[] args) {
        MyThread t= new MyThread();

        Thread thread = new Thread(t);
        Thread thread2 = new Thread(t);
        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

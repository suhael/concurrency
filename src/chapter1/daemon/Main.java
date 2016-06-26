package chapter1.daemon;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class Main {
    public static void main(String[] args) {
        Deque<Event> deque=new ArrayDeque<Event>();

        for (int i=0; i<3; i++){
            WriterTask writer=new WriterTask(deque);
            Thread thread=new Thread(writer);
            thread.start();
        }
        CleanerTask cleaner=new CleanerTask(deque);
        cleaner.start();
    }
}

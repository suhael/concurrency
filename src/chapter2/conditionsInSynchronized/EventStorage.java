package chapter2.conditionsInSynchronized;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sakhtar on 02/07/2014.
 */
public class EventStorage {
    private int maxSize;
    private List<Date> storage;

    public EventStorage(){
        maxSize=10;
        storage=new LinkedList<>();
    }

    public synchronized void set(){
        while (storage.size()==maxSize){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage.add(new Date());
        System.out.printf("Set: %d\n", storage.size());
        notifyAll();
    }

    public synchronized void get(){
        while (storage.size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Get: %d: %s\n",storage.size(),((LinkedList<?>)storage).poll());
        notifyAll();
    }
}

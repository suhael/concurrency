package chapter2.conditionsInSynchronized;

/**
 * Created by sakhtar on 03/07/2014.
 */
public class Consumer implements Runnable {

    private EventStorage storage;
    public Consumer(EventStorage storage){
        this.storage=storage;
    }

    public void run() {
        for (int i=0; i<100; i++){
            storage.get();
        }
    }
}

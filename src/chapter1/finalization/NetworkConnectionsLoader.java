package chapter1.finalization;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class NetworkConnectionsLoader implements Runnable {
    public void run() {
        System.out.printf("Beginning network sources loading: %s\n",new Date());
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Network sources loading has finished: %s\n",new Date());
    }
}

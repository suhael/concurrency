package chapter2.synchronizedMethods;

/**
 * Created by sakhtar on 02/07/2014.
 */
public class Bank implements Runnable {

    private Account account;

    public Bank(Account account) {
        this.account=account;
    }

    public void run() {
        for (int i=0; i<100; i++){
            account.subtractAmount(1000);
        }
    }
}

package chapter1.threadInformation;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class Calculator implements Runnable {

    private int number;

    public Calculator(int number) {
        this.number = number;
    }

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i , i*number);
        }
    }
}

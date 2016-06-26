package chapter3.syncCommonPoint;

/**
 * Created by sakhtar on 11/07/2014.
 */
public class Grouper implements Runnable {

    private Results results;

    public Grouper(Results results){
        this.results=results;
    }

    public void run() {
        int finalResult=0;
        System.out.printf("Grouper: Processing results...\n");
        int data[]=results.getData();
        for (int number:data){
            finalResult+=number;
        }

        System.out.printf("Grouper: Total result: %d.\n",finalResult);
    }
}

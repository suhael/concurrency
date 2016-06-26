package chapter4.separateLaunchTasksAndProcessing;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by sakhtar on 28/08/2014.
 */
public class ReportProcessor implements Runnable {
    private CompletionService<String> service;
    private boolean end;

    public ReportProcessor (CompletionService<String> service){
        this.service=service;
        end=false;
    }

    public void run() {
        while (!end){
            try {
                Future<String> result=service.poll(20, TimeUnit.SECONDS);
                if (result!=null) {
                    String report=result.get();
                    System.out.printf("ReportReceiver: Report Received: %s\n",report);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("ReportSender: End\n");
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

}

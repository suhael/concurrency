package chapter4.separateLaunchTasksAndProcessing;

import java.util.concurrent.CompletionService;

/**
 * Created by sakhtar on 28/08/2014.
 */
public class ReportRequest implements Runnable {

    private String name;
    private CompletionService<String> service;

    public ReportRequest(String name, CompletionService<String> service){
        this.name=name;
        this.service=service;
    }

    public void run() {
        ReportGenerator reportGenerator=new ReportGenerator(name,"Report");
        service.submit(reportGenerator);
    }

}

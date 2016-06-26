package chapter4.createThreadExecutor;

/**
 * Created by sakhtar on 26/08/2014.
 */
public class Main {
    public static void main(String[] args) {
        Server server=new Server();
        for (int i=0; i<100; i++){
            Task task=new Task("Task "+i);
            server.executeTask(task);
        }
        server.endServer();
    }
}

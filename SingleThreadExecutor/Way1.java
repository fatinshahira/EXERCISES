package singlethreadexecutor1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SingleThreadExecutor1 {

    public static void main(String[] args) {
        
        Task task = new Task();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(task);
        executorService.shutdown();
    }
    
}

class Task implements Runnable{

@Override
public void run(){
    System.out.println(Thread.currentThread().getName());

}

}

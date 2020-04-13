import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor1 {

    public static void main(String[] args) {
        
       ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable(){
             @Override
             public void run(){
                   System.out.println(Thread.currentThread().getName());
    }
        });
     executorService.shutdown();
    }
    
}

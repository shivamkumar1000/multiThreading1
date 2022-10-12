import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class thread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+" ");
        }
    }
}
class thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=101;i<200;i++){
            System.out.println(i+" ");
        }
    }
}
public class Question2 {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService es = Executors.newSingleThreadExecutor();
        System.out.println("tasks by cached thread pool");
        es.execute(new thread1());
        es.execute(new thread2());

        ExecutorService es1 = Executors.newCachedThreadPool();
        System.out.println("tasks by cached thread pool");
        es1.execute(new thread1());
        es1.execute(new thread2());

        ExecutorService es2 = Executors.newFixedThreadPool(2);
        System.out.println("tasks by cached thread pool");
        es2.execute(new thread1());
        es2.execute(new thread2());
        es.shutdown();
        es1.shutdown();
        es2.shutdown();

    }
}

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class runnable implements Runnable{
    @Override
    public void run() {
        System.out.println("This is inside runnable.");
    }
}
class callable implements Callable<String>{
    @Override
    public String call(){
        return "This is inside Callable.";
    }
}

class Question4 {
    public static void main(String[] args) {
        runnable r = new runnable();
        callable c = new callable();
        Thread t1 = new Thread(r);

        t1.start();
        System.out.println(c.call());

    }
}

class UsingThread extends Thread{
    @java.lang.Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
class UsingRunnable implements Runnable{
    @java.lang.Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}

class Question1 {
    public static void main(String[] args) throws InterruptedException {
        UsingThread ut = new UsingThread();
        UsingRunnable ur = new UsingRunnable();
        Thread t1 = new Thread(ut);
        Thread t2 = new Thread(ur);
        t1.start();
        t1.join();
        Thread.sleep(1000);
        t2.start();
        t2.join();

    }

}


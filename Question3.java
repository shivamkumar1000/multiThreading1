class thread extends Thread{
    @java.lang.Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }
    }
}

class thread_a extends Thread{
    @java.lang.Override
    synchronized public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }
    }
}



class Question3 {
    public static void main(String[] args) throws InterruptedException{
        thread t = new thread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("/n");
        thread_a tt = new thread_a();
        Thread t4 = new Thread(tt);
        Thread t5 = new Thread(tt);
        Thread t6 = new Thread(tt);
        t4.start();
        t5.start();
        t6.start();


    }
}

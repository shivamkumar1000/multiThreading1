
public class Question5 {
    public static void main(String[] args) {
        final String resource1 = "Shivam";
        final String resource2 = "Kumar";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
//this is a deadlock sitution in this thread1 is holding resource1 and waiting for resource2 and thread2 is holding resource2 and waiting for resource1.
//So this is a deadlock. 


public class Main{

    public static void main(String[] args) throws InterruptedException {
        
        // Create thread1 = new MyThread
        MyThread thread1 = new MyThread();

        //or

        //implement Runnable interface and pass instance as an argument to Thread()
        MyRunable runable = new MyRunable();
        Thread thread2 = new Thread(runable);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        // thread1.join(3000); //calling thread (ex.main) wait until the specified thread dieas or for x millisecond
        thread2.start();

        // System.out.println(1/0);
    }
}





        /*
multithreading = Process of executing multiple threads simultaneously 
                 Helps maximum utilization of CPU
                 Threads are independent, they don't affect the execution of  other threads
                 An exception in one thread will not interrupt other threads
                 useful for serving multiple clients, multiplayer games, or other mutually independent task
        */
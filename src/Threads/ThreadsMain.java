package Threads;

public class ThreadsMain {

    public static void main(String[] args) throws InterruptedException {

        ThreadExample t1 = new ThreadExample();

        ThreadExample t2 = new ThreadExample();

        t1.setCountTo(10);
        t1.setName("a");
        t2.setCountTo(20);
        t2.setName("b");

        t1.setSleepFor(300);

        t2.setSleepFor(500);


        t1.start();
        //t1.join();
        t2.start();
    }
}

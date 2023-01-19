package Threads;

public class ThreadExample extends Thread{

    private int countTo;
    private int sleepFor;


    public void run(){
        for (int i=0;i<=countTo;i++){
            System.out.println(this.getName()+": "+i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCountTo() {
        return countTo;
    }

    public void setCountTo(int countTo) {
        this.countTo = countTo;
    }

    public int getSleepFor() {
        return sleepFor;
    }

    public void setSleepFor(int sleepFor) {
        this.sleepFor = sleepFor;
    }
}

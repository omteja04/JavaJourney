package Programs;

public class ThreadUsageExample {
    public static void main(String[] args) {
        // Creating a new Thread means creating an instance of a class which is a
        // subclass of Thread class
        MyThread myThread1 = new MyThread(); // Thread1 is created
        myThread1.start(); // Triggers the thread1
        MyThread myThread2 = new MyThread(); // Thread2 is created
        myThread2.start(); // Triggers the thread2
    }
}

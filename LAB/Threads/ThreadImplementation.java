/**
 * Author: omteja04
 * Description: ThreadImplementation
 */

package LAB.Threads;

public class ThreadImplementation {
    public static void main(String[] args) {
        // Threads extending Thread class
        DisplayThread thread1 = new DisplayThread("Good Morning", 1000);
        DisplayThread thread2 = new DisplayThread("Hello", 2000);
        DisplayThread thread3 = new DisplayThread("Welcome", 3000);

        // Threads implementing Runnable interface
        Thread runnableThread1 = new Thread(new DisplayRunnable("Good Morning", 1000));
        Thread runnableThread2 = new Thread(new DisplayRunnable("Hello", 2000));
        Thread runnableThread3 = new Thread(new DisplayRunnable("Welcome", 3000));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        runnableThread1.start();
        runnableThread2.start();
        runnableThread3.start();
    }
}

// Extending Thread class
class DisplayThread extends Thread {
    private String message;
    private int delay;

    public DisplayThread(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Implementing Runnable interface
class DisplayRunnable implements Runnable {
    private String message;
    private int delay;

    public DisplayRunnable(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
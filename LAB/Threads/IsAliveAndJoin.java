/**
 * Author: omteja04
 * Description: IsAliveAndJoin
 */

package LAB.Threads;

public class IsAliveAndJoin {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        System.out.println("Thread is alive: " + thread.isAlive());

        thread.start();

        System.out.println("Thread is alive: " + thread.isAlive());

        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is alive: " + thread.isAlive());
    }
}

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(2000);
            System.out.println("Thread is finished.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

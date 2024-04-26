/**
 * Author: omteja04
 * Description: DaemonThreadExample
 */

package LAB.Threads;

public class DaemonThreadExample {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // Setting daemon status
        daemonThread.start();

        Thread userThread = new DaemonThread();
        userThread.start();
    }
}

class DaemonThread extends Thread {
    public void run() {
        if (isDaemon()) {
            System.out.println(this.getName() + " is a daemon thread.");
        } else {
            System.out.println(this.getName() + " is a user thread.");
        }
        try {
            Thread.sleep(2000); // Simulating some task
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(this.getName() + " has finished.");
    }
}

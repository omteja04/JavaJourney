package Programs;

/**
 * Author: omteja04
 * Description: MyThread
 */

public class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(this.getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

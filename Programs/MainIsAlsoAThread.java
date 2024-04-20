package Programs;

public class MainIsAlsoAThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 200; i <= 300; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

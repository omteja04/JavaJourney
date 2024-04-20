package Programs;

public class ThreadsExample2 {
    public static void main(String[] args) {
        MyThread[] thread = new MyThread[1000];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new MyThread();
        }
        for(int i = 0; i < thread.length; i++) {
            thread[i].start();
        }

    }
}

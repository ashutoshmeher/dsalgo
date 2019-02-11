package code.ashutoshmeher.dsalgo.thread;

public class EvenOddPrinting {

    public static void main(String args[]) {

        Object lock = new Object();

        Runnable even = () -> {
            try {
                synchronized (lock) {
                    for (int i = 2; i < 100; i += 2) {
                        System.out.print(i + " ");
                        lock.notify();
                        lock.wait();
                    }
                }
            }catch (Exception e){e.printStackTrace();}
        };

        Runnable odd = () -> {
            try {
                synchronized (lock) {
                    for (int i = 1; i < 100; i += 2) {
                        System.out.print(i + " ");
                        lock.notify();
                        lock.wait();
                    }
                }
            }catch (Exception e){e.printStackTrace();}
        };

        Thread oddThread = new Thread(odd);
        Thread evenThread = new Thread(even);

        oddThread.start();
        evenThread.start();

    }
}

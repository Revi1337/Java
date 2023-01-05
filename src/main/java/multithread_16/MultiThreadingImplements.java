package multithread_16;

public class MultiThreadingImplements implements Runnable{
    private int threadNumber;

    public MultiThreadingImplements(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(i + " Current ThreadNumber " + threadNumber);
            if (threadNumber == 3)
                throw new IllegalThreadStateException();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

package multithread_16;

public class MultiThreadExtends extends Thread{

    private int threadNumber;

   public MultiThreadExtends(int threadNumber) {
       this.threadNumber = threadNumber;
   }

    @Override
    public void run() {
        for (int i = 0; i <= 6 ; i++) {
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

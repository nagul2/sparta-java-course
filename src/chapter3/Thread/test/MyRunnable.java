package chapter3.Thread.test;

public class MyRunnable implements Runnable {

    private int startValue;
    private int endValue;
    private int result;


    public MyRunnable(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = startValue; i <= endValue; i++) {
            sum += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        result = sum;
    }
}

package chapter3.Thread.multi;

public class MyThread extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드: " + threadName);

        for (int i = 0; i < 10; i++) {
            System.out.println("현재 스레드 : " + threadName + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("현재 종료된 쓰레드: " + threadName);
    }
}

package chapter3.Thread.test;

public class MultiMain {
    public static void main(String[] args) {

        // 멀티 스레드
        long startTime = System.currentTimeMillis();

        MyRunnable task1 = new MyRunnable(1, 250);
        MyRunnable task2 = new MyRunnable(251, 500);
        MyRunnable task3 = new MyRunnable(501, 750);
        MyRunnable task4 = new MyRunnable(751, 1000);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("sum = " + (task1.getResult() + task2.getResult() + task3.getResult() + task4.getResult()));

        long endTime = System.currentTimeMillis();
        System.out.println("종료 시간: " + (endTime - startTime) + " ms");
    }
}

package chapter3.Thread.join;

import chapter3.Thread.multi.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== main 쓰레드 시작 ====");

        Thread thread0 = new MyThread();
        Thread thread1 = new MyThread();

        long startTime = System.currentTimeMillis();

        // 1. thread0 시작
        System.out.println("thread0 시작");
        thread0.start();

        // 2. thread1 시작
        System.out.println("thread0 종료");
        thread1.start();

        // main 스레드 대기 시키기
        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("작업 소요 시간: " + (endTime - startTime) + "ms");
        System.out.println("==== main 쓰레드 종료 ====");
    }
}

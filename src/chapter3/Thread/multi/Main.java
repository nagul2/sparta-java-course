package chapter3.Thread.multi;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== main 쓰레드 시작 ====");

        Thread thread0 = new MyThread();
        Thread thread1 = new MyThread();

        // 1. thread0 시작
        System.out.println("thread0 시작");
        thread0.start();

        // 2. thread1 시작
        System.out.println("thread0 종료");
        thread1.start();

        System.out.println("==== main 쓰레드 종료 ====");
    }
}

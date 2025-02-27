package chapter3.Thread.test;

public class SingleMain {
    public static void main(String[] args) {

        // 싱글 스레드
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            try {
                sum += i;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("sum = " + sum);
        long endTime = System.currentTimeMillis();
        System.out.println("종료 시간: " + (endTime - startTime) + " ms");

    }
}

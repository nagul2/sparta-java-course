package chapter3.Thread.single;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== main 쓰레드 시작 ====");
        String threadName = Thread.currentThread().getName();

        // 하나의 작업: 숫자를 0 ~ 9 까지 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드이름: " + threadName + " - " + i);
            try {
                Thread.sleep(500); // 0.5초 딜레이
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 추가 작업
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드이름: " + threadName + " - " + i);
            try {
                Thread.sleep(500); // 0.5초 딜레이
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("== 작업 종료 ==");
    }
}

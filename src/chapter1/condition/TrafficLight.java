package chapter1.condition;

import java.util.Scanner;

public class TrafficLight {

    private static final String GREEN = "초록불";
    private static final String YELLOW = "노란불";
    private static final String RED = "빨간불";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        printBlinker(scanner.nextLine());

        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        printBlinker(scanner.nextLine());

        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        printBlinker(scanner.nextLine());

        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        printBlinker(scanner.nextLine());
    }

    private static void printBlinker(String input) {
        switch (input) {
            case GREEN -> System.out.println("건너세요!");
            case YELLOW -> System.out.println("주의하세요!");
            case RED -> System.out.println("멈추세요!");
            default -> System.out.println("잘못된 입력입니다.");
        }
    }
}

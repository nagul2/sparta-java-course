package chapter1.loop;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 구구단 단수를 입력하세요 (2-9): ");
        int dan = scanner.nextInt();
        System.out.println("==== " + dan + "단 ====");
        for (int i = 1; i <= 9; i++) {
            int result = i * dan;
            System.out.println(dan + " x " + i + " = " + result);
        }
    }
}

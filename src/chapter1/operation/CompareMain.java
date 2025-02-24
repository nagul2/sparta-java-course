package chapter1.operation;

import java.util.Scanner;

public class CompareMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 첫 번째 문자열 입력받기
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String sentence1 = scanner.nextLine();

        // 사용자로부터 두 번째 문자열 입력받기
        System.out.print("두 번째 문자열을 입력하세요: ");
        String sentence2 = scanner.nextLine();

        // 문자열 비교 결과를 변수 result에 저장
        boolean result = sentence1.equals(sentence2);

        // 결과 출력
        System.out.println("두 문자열이 같은가요? " + result);

    }
}

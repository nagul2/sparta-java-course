package chapter1.operation;

public class OperationMain {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        // 더하기
        int sum = a + b;
        // 더하기 결과 출력
        System.out.println("덧셈 결과: " + sum);

        // 빼기
        int sub = a - b;

        // 빼기 결과 출력
        System.out.println("뺄셈 결과: " + sub);

        // 곱셈
        int mul = a * b;

        // 곱셈 결과 출력
        System.out.println("곱셈 결과: " + mul);

        // 나눗셈
        int div = a / b;

        // 나눗셈 결과
        System.out.println("나눗셈 결과: " + div);

        // 나머지
        int mod = a % b;

        // 나머지 결과
        System.out.println("나머지 결과: " + mod);
    }
}

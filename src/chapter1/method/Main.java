package chapter1.method;

public class Main {
    public static void main(String[] args) {
        // 1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();

        // 2. 메서드를 호출
        int result = calculator.sum(10, 20);
        System.out.println("result = " + result);
    }

}

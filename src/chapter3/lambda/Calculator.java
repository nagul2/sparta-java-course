package chapter3.lambda;

// 함수형 인터페이스 애노테이션 작성
@FunctionalInterface
public interface Calculator {
    int sum (int a, int b);

    // @FunctionalInterface 애노테이션을 사용하고 추상메서드가 2개 이상이면 에러발생
//    int subtract (int a, int b);
}

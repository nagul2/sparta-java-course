package chapter2.interfaceexample.v1;

public class Bird implements Animal, Flyable {

    // 인터페이스의 변수는 public static final로 선언됨,
    // 인터페이스는 표준의 역할이기 때문에 변수선언은 최소화 하는 것을 권장함

    @Override
    public void eat() {
        System.out.println("새가 음식을 먹는다");
    }

    @Override
    public void fly() {
        System.out.println("새가 난다");
    }

    void land() {
        System.out.println("새가 착륙합니다.");
    }
}

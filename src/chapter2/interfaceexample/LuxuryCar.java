package chapter2.interfaceexample;

public class LuxuryCar implements Car {
    @Override
    public void drive() {
        System.out.println("멋지게 이동합니다.");
    }

    @Override
    public void stop() {
        System.out.println("멋지게 정지합니다.");
    }

    void autoParking() {
        System.out.println("자동 주차 기능을 실행합니다.");
    }

//    void move() {
//        System.out.println("멋지게 이동합니다.");
//    }
//
//    void stop() {
//        System.out.println("멋지게 정지합니다.");
//    }
}

package chapter2.finalexample;

public class Circle {
    // 속성
    final static double PI = 3.14159;
    final double radius;  // 모든 속성에 final이 없으면 불변 객체가 아님

    // 생성자
    Circle(double radius) {
        this.radius = radius;
    }

    // 새로운 Circle을 만드는 메서드
    Circle changeRadius(double newRadius) {
        return new Circle(newRadius);   // 매개변수의 값으로 Circle을 생성
    }
}

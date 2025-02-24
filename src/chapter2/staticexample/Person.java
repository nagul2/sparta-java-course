package chapter2.staticexample;

public class Person {
    // static 변수
    static int population = 0;

    // 인스턴스 변수
    String name;

    // 기본 생성자 호출할 때마다 population 값을 1 증가
    public Person() {
        population++;
    }

    // static 메서드
    static void printPopulation() {
        System.out.println("현재 인구 수: " + population);
    }

    // 인스턴스 메서드
    void printName() {
        System.out.println("나의 이름은 " + name + "입니다.");
    }
}

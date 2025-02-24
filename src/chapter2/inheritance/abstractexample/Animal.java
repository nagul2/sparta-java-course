package chapter2.inheritance.abstractexample;

// 추상 클래스 선언, 추상 클래스는 new 로 인스턴스화 할 수 없음
abstract class Animal {

    public String name;

    abstract void eat();    // 추상 메서드 -> 자식에서 무조건 구현해야 함

    public void sleep() {
        System.out.println("쿨쿨..");
    }
}

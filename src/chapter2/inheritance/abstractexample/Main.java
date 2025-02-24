package chapter2.inheritance.abstractexample;

public class Main {
    public static void main(String[] args) {

        // 추상 클래스는 인스턴스화 할 수 없음
//        Animal animal = new Animal();
        Cat cat = new Cat();
        cat.name = "Cat";
        cat.sleep();

        // 자식에서 강제 구현된 메서드
        cat.eat();
    }
}

package chapter2.abstraction.v2;

public class Cat extends Animal {
    // 부모의 메서드를 제정의
    @Override
    void makeSound() {
        System.out.println("상속받아서 야옹");
    }

    public void scratch() {
        System.out.println("고양이는 스크래치를 낸다.");
    }
}

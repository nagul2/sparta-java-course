package chapter2.polymorphism;

public class Dog implements Animal {
    @Override
    public void exist() {
        System.out.println("강아지는 존재한다.");
    }

    @Override
    public void makeSound() {
        System.out.println("강아지가 울어요. 멍멍");
    }

    public void wag() {
        System.out.println("꼬리 흔들기!");
    }

}

package chapter2.polymorphism;

public class Cat implements Animal {
    @Override
    public void exist() {
        System.out.println("고양이는 존재한다.");
    }

    @Override
    public void makeSound() {
        System.out.println("고양이가 울어요. 야옹");
    }

    public void scratch() {
        System.out.println("고양이의 스크래치!");
    }
}

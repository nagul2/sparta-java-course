package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {
        // 다형성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        animal2.exist();
        animal2.makeSound();

        // 업캐스팅 주의사항
//        animal1.scratch();    // 자식타입의 고유 기능을 사용할 수 없음
//        animal2.wag();        // 동일

        // 고유 기능을 사용하려면 다운 캐스팅이 필요함
        Cat cat = (Cat) animal1;
        cat.scratch();

        Dog dog = (Dog) animal2;
        dog.wag();

        // 다운캐스팅 주의사항 -> 잘못된 다운캐스팅은 컴파일단계에서 감지할 수 없음
//        Cat cat2 = (Cat) animal2;   // animal2는 Dog 이지만 컴파일단계에서 명시적 다운 캐스팅을 해도 컴파일에서 오류률 잡아주지 않음
//        cat2.scratch(); // ClassCastException 예외 발생

        // 다운 캐스팅 instanceof 활용
        if (animal2 instanceof Cat cat2) {  // 자바 16부터 가능
            cat2.scratch();
        } else {
            System.out.println("객체가 고양이가 아닙니다.");
        }

        // 다형성의 장점 맛보기
        Animal[] animals = {new Cat(), new Dog()};  // 다형성 덕분에 자식의 객체를 모두 담을 수 있음
        System.out.println("========================================");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

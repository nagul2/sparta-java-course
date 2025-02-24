package chapter2.clazz;

public class Person {

    // 1. 속성 - 변수 선언
    String name;
    int age;
    String address;

    // 2. 생성자
//    public Person() {} // 기본 생성자

    // 매개 변수가 있는 생성자를 선언하면 자바 컴파일러가 기본 생성자를 자동으로 만들어 주지 않음
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * 생성자의 특징
     * 1. 클래스와 이름이 같음
     * 2. 반환 타입이 존재하지 않음
     * 3. 여러개가 존재할 수 있음
     */

    // 3. 기능(메서드 부분)
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // 게터 - 속성을 읽음
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // 세터 - 속성을 설정
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

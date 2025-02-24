package chapter2.capsulation;

public class Person {
    // 속성
//    public String name; // private으로 사용해야 외부에서 필드의 값을 변경할 수 없으므로 캡슐화 할 수 있음
    private String name;
    private String secret;

    // 생성자
//    private Person() {} // 생성이 안됨
//    Person() {} // 같은 패키지에서 접근 가능(default)

    // 객체 생성 시점에 한번 설정해놓으면 외부에서 값을 변경할 수 없음
    public Person(String name, String secret) {
        this.name = name;
        this.secret = secret;
    }

    // 기능
    public void methodA() {}
    private void methodB() {}

    // 게터
    public String getName() {
        return name;
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }
}

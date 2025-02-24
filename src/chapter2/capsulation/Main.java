package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {
        // 생성자 호출
        Person person = new Person("김사람", "secret");

        // 인스턴스 변수 접근
//        person.name = "gygim";
//        person.secret = "접근 불가";  // private 접근 제어자, 접근 불가

        // 인스턴스 메서드 접근
        person.methodA();
//        person.methodB();     // private 접근 제어가, 접근 불가


        // 게터로 필드의 값을 확인
        String name = person.getName();
        System.out.println("name = " + name);

        // 세터로 필드의 값을 수정
        person.setName("Steve");
        String name1 = person.getName();
        System.out.println("name1 = " + name1);

        // 무분별한 세터는 지양해야함 -> 이 메서드를 호출하면 아무나 값을 수정할 수 있음
    }

}

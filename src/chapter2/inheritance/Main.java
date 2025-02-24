package chapter2.inheritance;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("가문이름: " + child.familyName);
        System.out.println("명예: " + child.honor);
        child.introduceFamily();    // 오버라이딩 되면 오버라이딩 된 메서드가 우선권을 가짐
        child.superTest();
        child.showSocialMedia();
    }
}

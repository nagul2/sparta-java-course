package chapter2.wrapper;

public class Main {
    public static void main(String[] args) {
        // 기본형 변수
        int a = 1;
        System.out.println("a = " + a);

        // 참조형 변수
        Person personA = new Person();
        System.out.println("personA = " + personA);
        int[] arr = {1, 2, 3};
        System.out.println("arr = " + arr);

        // 래퍼클래스(기본형 변수를 감싸고 있는 클래스) -> 참조형
        Integer num = 100;
        System.out.println("num = " + num); // 참조형 변수이지만 내부적으로 바로 값을 출력할 수 있도록 처리 되어있음
        String numString = num.toString();
        System.out.println("numString = " + numString);

        // 직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String myStrInteger = myInteger.toString();
        System.out.println("myStrInteger = " + myStrInteger);

        // 오토 박싱
        Integer num3 = 10;
//        Integer num3 = Integer.valueOf(10);   // 내부적으로 이렇게 동작함

        // 오토 언박신
        int num4 = num3;
//        int num4 = num3.intValue();   // 내부적으로 이렇게 동작함
    }
}

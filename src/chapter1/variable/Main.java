package chapter1.variable;

public class Main {
    public static void main(String[] args) {
        // [자료형] [변수이름];
        int a;
        a = 1;
        a = 2;
        System.out.println("a = " + a);

        // 논리형
        boolean booleanBox = true;
        booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);

        // 문자형
        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox = " + charBox);

        // 큰 정수형
        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);

        // 실수형
        float floatBox = 0.12345678f;
        floatBox = 0.1234567890f;   // 표현 범위를 벗어나면 마지막 반오림
        System.out.println("floatBox = " + floatBox);

        double doubleBox = 0.1234567890;
        System.out.println("doubleBox = " + doubleBox);

        // 캐스팅(Casting)
        // 다운캐스팅 : 큰 데이터를 -> 작은 상자
        // 손실이 발생할 수 있고 에러가 발생할 수 있기 때문에 명시적으로 캐스팅 선언이 필요함
        double bigBox = 10.123;
        int smallBox = (int) bigBox;
        System.out.println("smallBox = " + smallBox);

        // 업 캐스팅 : 작은 데이터 -> 큰 상자
        // 손실이 없으므로 명시적 형변환 없이 가능
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        System.out.println("smallBox2 = " + smallBox2);

        // 문자열 데이터
        char a1 = 'a';
        String str = "안녕하세요!";

        // 정수형
        int a2 = 1;
        long a3 = 1;

        // 논리형
        boolean b1 = true;
    }
}

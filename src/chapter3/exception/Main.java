package chapter3.exception;

public class Main {
    public static void main(String[] args) {

        // 의도하지 않은 예외
//        int ret = 10 / 0;   // 예외 발생
//        System.out.println("ret = " + ret); // 아래 코드들이 실행 안됨
//        System.out.println("프로그램 종료");

        // 의도적인 예외 - throw
//        int age = 10;
//        if (age < 18) {
//            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");    // 예외가 발생함
//        }

        // 언체크 예외 호출
        ExceptionPractice exceptionPractice = new ExceptionPractice();

//        try {
//            exceptionPractice.callUncheckedException(); // 런타임 예외 발생
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리");    // main에서 예외 처리
//        }


        // 체크 예외 호출
        exceptionPractice.callCheckedException();

        try {
            exceptionPractice.callCheckedExceptionThrows(); // 상위로 예외가 올라옴, 컴파일러에서 확인해줌 -> main에서 처리
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }

        System.out.println("프로그램 종료");
    }
}

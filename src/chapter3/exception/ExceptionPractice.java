package chapter3.exception;

public class ExceptionPractice {
    // 언체크 예외 호출 예시
    public void callUncheckedException() {
        if (true) {     // try - catch로 예외를 안잡으면 상위로 예외가 전파됨
            System.out.println("언체크 예외 발생");
            throw new RuntimeException();
        }

//        try {
//            if (true) {
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e) {  // catch문은 여러개 할 수 있음
//            System.out.println("언체크 예외 처리");
//        }
    }

    // 체크 예외 호출 예시
    public void callCheckedException() {
        try {
            if (true) {
                System.out.println("체크 예외 발생");
                throw new Exception();  // 컴파일러가 예외를 체크해줌, 체크예외는 무조건 던지거나 처리해야 함
            }
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }
    }

    // 체크 예외 던지기 - throws로 예외를 상위로 던짐
    public void callCheckedExceptionThrows() throws Exception {
        if (true) {
            System.out.println("체크 예외 발생");
            throw new Exception();
        }
    }
}

package chapter1.condition;

public class Main {
    public static void main(String[] args) {

        // if, if - else, if - else if

//        String light = "초록불";
        String light = "노란불";
//        String light = "빨간불";

        if (light.equals("초록불")) {
            System.out.println("건너세요!");

        } else if (light.equals("노란불")) {
            System.out.println("주의하세요!");

        } else {
            System.out.println("멈추세요!");
        }
        System.out.println("...");

        // switch 문
        int number = 1;

        switch (number) {
            // fall-through 현상 주의(case문에 break가 없을경우 break를 만나거나 switch문이 끝날때까지 출력됨)
            case 1:
                System.out.println("1입니다.");    // break문 필수
                break;
            case 2:
                System.out.println("2입니다.");    // break문 필수
                break;
            default:
                System.out.println("1도 아니고 2도 아닙니다.");  // 마지막이므로 break문 필요 없음
        }
    }
}

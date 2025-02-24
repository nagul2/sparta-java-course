package chapter1.loop;

public class Main {
    public static void main(String[] args) {

        // 로봇한테 10번 인사 반복 시키기
/*
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");
*/
        // 10번 반복! -> X, 반복문을 활용
        // 반복문 (for)
        int customers = 5;
        for (int i = 1; i <= customers; i++) {
            if (i == 4) {
                break;  // i가 4가되면 반복문 탈출
            }

            if (i == 2) {
                continue;   // i가 2가 되면 건너뜀, 다시 반복
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }

        // 반복문 (while), 무한 반복 조심
        int i = 1;
        while (i <= 10) {
            System.out.println(i + "번째 손님, 안녕하세요!");
            i++;
        }

        // 반복문(do-while)
        int i1 = 1;
        do {
            System.out.println(i1 + "do-while 안녕하세요!");
            i1++;
        } while (i1++ <= 10);
    }
}

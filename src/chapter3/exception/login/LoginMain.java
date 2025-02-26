package chapter3.exception.login;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User("user1", "12345");

        while (true) {
            System.out.print("아이디를 입력해 주세요: " );
            String id = scanner.nextLine();

            System.out.print("비밀번호를 입력해 주세요: ");
            String password = scanner.nextLine();

            try {
                String loginId = user.adminLogin(id, password);
                System.out.println(loginId + " 관리자 로그인 성공");
                break;
            } catch (LoginException e) {
                System.out.println("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
                continue;
            }
        }




    }
}

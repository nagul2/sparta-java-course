package chapter3.optional.newCamp;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] students = {new Student("Spartan", 24), new Student("Steve", 34), new Student("John", 27)};
        CampService campService = new CampService(students);


        while (true) {
            System.out.print("찾을 학생을 입력하세요 (프로그램 종료: exit): ");
            String target = scanner.nextLine();

            Optional<Student> findStudentOptional = campService.findStudent(target);

            if (findStudentOptional.isPresent()) {
                Student student = findStudentOptional.get();
                System.out.println("학생 이름: " + student.getName());
                System.out.println("학생 나이:" + student.getAge());
            } else if ("exit".equals(target)) {
                break;
            } else {
                System.out.println("입력하신 학생을 찾을 수 없습니다. 다시 입력해 주세요");
            }
        }
    }
}

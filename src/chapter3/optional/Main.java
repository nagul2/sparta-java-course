package chapter3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
        Student steve = new Student("steve");
        camp.setStudent(steve);

        // 1. student = null
//        Student student = camp.getStudent();
//        System.out.println("student = " + student); // null

        // Optional 사용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent(); // 값이 존재하면 true,
        // orElseGet()은 값이 없을 때만 기본값을 제공, 람다를 이해해야 함

        if (flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }

        // 직접적인 null 처리 방법 -> 나쁜 방법은 아니지만, 모든 객체를 이렇게 하기가 현실적으로 쉽지 않음
//        String studentName = null;
//        if (studentOptional != null) {
//            studentName = studentOptional.getName();
//        } else {
//            System.out.println("등록된 학생이 아닙니다.");
//        }
//        System.out.println("studentName = " + studentName);

        // 2. NullPointerException
//        String studentName = student.getName();
//        System.out.println("studentName = " + studentName);
    }
}

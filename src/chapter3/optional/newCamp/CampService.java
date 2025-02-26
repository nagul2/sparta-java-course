package chapter3.optional.newCamp;

import java.util.Optional;

public class CampService {

    private Student[] studentArr;

    public CampService(Student[] student) {
        this.studentArr = student;
    }

    public Optional<Student> findStudent(String name) {
        for (Student student : studentArr) {
            if (student.getName().equals(name)) {
                return Optional.ofNullable(student);
            }
        }
        return Optional.empty();
    }
}

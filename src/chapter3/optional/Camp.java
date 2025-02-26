package chapter3.optional;

import java.util.Optional;

public class Camp {
    private Student student;

    public Optional<Student> getStudent() {
        return Optional.ofNullable(student);
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

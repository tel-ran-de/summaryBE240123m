package summary4.dto;

import summary4.businesslogic.StudentsService;
import summary4.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class OperationResult {

    private List<Error> errors = new ArrayList<>();
    private Student student;

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "OperationResult{" +
                "errors=" + errors +
                ", student=" + student +
                '}';
    }
}

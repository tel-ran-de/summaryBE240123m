package summary4.database;

import summary4.domain.Groups;
import summary4.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDBImpl implements StudentsDB {

    private final List<Student> database = new ArrayList<>();


    @Override
    public void add(Student newStudent) {

    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public Student getStudentByName(String name) {
        return null;
    }

    @Override
    public List<Student> getStudentsByGroup(Groups group) {
        return null;
    }
}

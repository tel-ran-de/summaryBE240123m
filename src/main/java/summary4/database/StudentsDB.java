package summary4.database;

import summary4.domain.Groups;
import summary4.domain.Student;

import java.util.List;

public interface StudentsDB {

    void add(Student newStudent);
    List<Student> getAllStudents();
    void delete(Student student);

    Student getStudentByName(String name);
    List<Student> getStudentsByGroup(Groups group);

}

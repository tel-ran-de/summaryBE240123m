package summary4.database;

import summary4.domain.Groups;
import summary4.domain.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentDBImpl implements StudentsDB {

    private final List<Student> database = new ArrayList<>();


    @Override
    public void add(Student newStudent) {
        database.add(newStudent);
    }

    @Override
    public List<Student> getAllStudents() {
        return database;
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public List<Student> getStudentByName(String lastName) {

        List<Student> studentsByName = new LinkedList<>();

        for (Student student : database) {
            if (student.getLastName().equals(lastName)){
                studentsByName.add(student);
            }
        }

        return studentsByName;
    }

    @Override
    public List<Student> getStudentsByGroup(String group) {

        List<Student> studentsByGroup = new ArrayList<>();

        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getGroup().equals(group)) {
                studentsByGroup.add(database.get(i));
            }
        }
        return studentsByGroup;
    }
}

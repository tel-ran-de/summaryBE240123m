package summary4.businesslogic;

import summary4.database.StudentsDB;
import summary4.domain.Student;

import java.util.List;

public class StudentsService {

    private final StudentsDB repository;

    public StudentsService(StudentsDB repository) {
        this.repository = repository;
    }

    public void addStudent(Student newStudent){
        repository.add(newStudent);
    }

    public List<Student> findAll(){
        return repository.getAllStudents();
    }
}

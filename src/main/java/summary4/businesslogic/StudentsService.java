package summary4.businesslogic;

import summary4.database.StudentsDB;
import summary4.domain.Student;
import summary4.dto.OperationResult;

import java.util.ArrayList;
import java.util.List;

public class StudentsService {

    private final StudentsDB repository;

    public StudentsService(StudentsDB repository) {
        this.repository = repository;
    }

    public OperationResult addStudent(Student newStudent){
        // провести валидацию данных и если все ОК то добавить нового студента
        // if isValidation == true то записать в базу данных нового студента и код ошибки = 200

        repository.add(newStudent);

        // иначе код ошибки = 404

        // занести в OperationResul код ошибки от результата валидации нового студента
        return new OperationResult();
    }

    public List<Student> findAll(){
        return repository.getAllStudents();
    }


    public List<Student> findByGroup(String groupName){

        // проверка и валидация прав доступа, корректности groupName и тд

        return repository.getStudentsByGroup(groupName);

        }

    public List<Student> findByLastName(String lastName){

        // проверка и валидация прав доступа, корректности groupName и тд

        return repository.getStudentByName(lastName);

    }

}

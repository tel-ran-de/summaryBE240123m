package summary4.ui;

import summary4.businesslogic.StudentsService;
import summary4.domain.Student;

import java.util.List;

public class GetAllStudents implements MenuCommand{

    private final StudentsService service;

    public GetAllStudents(StudentsService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        List<Student> studentList = service.findAll();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public String getMenuName() {
        return "Get list of all students";
    }
}

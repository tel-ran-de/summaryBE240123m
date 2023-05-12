package summary4.ui;

import summary4.businesslogic.StudentsService;
import summary4.domain.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetStudentsByGroup implements MenuCommand{

    private final StudentsService service;

    public GetStudentsByGroup(StudentsService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        System.out.println("Please enter group name: ");
        Scanner sc = new Scanner(System.in);
        String groupName = sc.nextLine();

        List<Student> studentsByGroup = service.findByGroup(groupName);

        for (int i = 0; i < studentsByGroup.size(); i++) {
            System.out.println(studentsByGroup.get(i));
        }

    }

    @Override
    public String getMenuName() {
        return "Get list of students by group";
    }
}

package summary4.ui;

import summary4.businesslogic.StudentsService;
import summary4.domain.Student;

import java.util.List;
import java.util.Scanner;

public class GetStudentsByLastName implements MenuCommand{

    private final StudentsService service;

    public GetStudentsByLastName(StudentsService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        System.out.println("Please enter student last name: ");
        Scanner sc = new Scanner(System.in);
        String lastName = sc.nextLine();

        List<Student> studentsByLstName = service.findByLastName(lastName);

        for (int i = 0; i < studentsByLstName.size(); i++) {
            System.out.println(studentsByLstName.get(i));
        }

    }

    @Override
    public String getMenuName() {
        return "Get list of students by group";
    }
}

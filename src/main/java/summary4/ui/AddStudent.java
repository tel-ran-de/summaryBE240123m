package summary4.ui;

import summary4.businesslogic.StudentsService;
import summary4.domain.Student;

import java.util.Scanner;

public class AddStudent implements  MenuCommand{

    private final StudentsService service;
    Scanner scanner = new Scanner(System.in);

    public AddStudent(StudentsService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        int id = Integer.parseInt(scannerString("Please enter student id"));

        String firstName = scannerString("Please enter student firstname");
        String lastName = scannerString("Please enter student secondname");
        int yearBD = Integer.parseInt(scannerString("Please enter student year"));
        String group = scannerString("Please enter student group");
        int course = Integer.parseInt(scannerString("Please enter student course"));
        double avdGrade = Double.parseDouble(scannerString("Please enter student average grade"));

        Student newStudent = new Student(id,firstName,lastName,yearBD,group,course,avdGrade);

        service.addStudent(newStudent);

    }

    @Override
    public String getMenuName() {
        return "Add new student";
    }



    private String scannerString(String message){

        System.out.println(message);
        String userInput = scanner.nextLine();

        return userInput;
    }


}

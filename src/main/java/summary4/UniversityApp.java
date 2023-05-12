package summary4;

import summary4.businesslogic.StudentsService;
import summary4.database.StudentDBImpl;
import summary4.ui.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {

        StudentDBImpl repository = new StudentDBImpl();
        StudentsService service = new StudentsService(repository);

        //--------------------------------------------------------


        AddStudent addStudent = new AddStudent(service);
        GetAllStudents getAllStudents = new GetAllStudents(service);
        GetStudentsByGroup getStudentsByGroup = new GetStudentsByGroup(service);
        GetStudentsByLastName getStudentsByLastName = new GetStudentsByLastName(service);
        ExitMenuCommand exitCommand = new ExitMenuCommand();
        List<MenuCommand> menuCommand = new ArrayList<>();

        menuCommand.add(exitCommand);
        menuCommand.add(addStudent);
        menuCommand.add(getAllStudents);
        menuCommand.add(getStudentsByGroup);
        menuCommand.add(getStudentsByLastName);

        UserMenu ui = new UserMenu(menuCommand);
        ui.startUserMenu();


    }
}

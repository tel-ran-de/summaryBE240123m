package summary4;

import summary4.businesslogic.StudentsService;
import summary4.database.StudentDBImpl;
import summary4.ui.AddStudent;
import summary4.ui.ExitMenuCommand;
import summary4.ui.MenuCommand;
import summary4.ui.UserMenu;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {

        StudentDBImpl repository = new StudentDBImpl();
        StudentsService service = new StudentsService(repository);

        //--------------------------------------------------------


        AddStudent addStudent = new AddStudent(service);
        ExitMenuCommand exitCommand = new ExitMenuCommand();
        List<MenuCommand> menuCommand = new ArrayList<>();

        menuCommand.add(exitCommand);
        menuCommand.add(addStudent);

        UserMenu ui = new UserMenu(menuCommand);
        ui.startUserMenu();


    }
}

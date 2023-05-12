package summary4;

import summary4.businesslogic.StudentsService;
import summary4.database.StudentDBImpl;
import summary4.ui.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {

        /*
        класс main в котором мы создаем два основных экземпляра классов
        StudentDBImpl repository = new StudentDBImpl();
        StudentsService service = new StudentsService(repository);

        в которых будет весь сервисный функционал и работа методов базы данных

        далее мы создаем меню = коллекцию в которой будут экземпляры классов,
        импл один и тот же интерфейс

        и далее создаем класс меню в котором запускаем метод start
         */

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

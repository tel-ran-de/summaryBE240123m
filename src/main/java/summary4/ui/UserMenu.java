package summary4.ui;

import java.util.List;
import java.util.Scanner;

public class UserMenu {
    // в вечном цикле до нажатия 0 - exit
    // запрос пользователя о выборе пункта меню
    // в зависимости от выбора 1-5
    //switch case 1: addStudent;

    // это подход не оптимальный и требует постоянных дополнений
    // в код при добавлении новых пунктов меню

    // попробуем сделать универсальное меню


    /*
    это класс меню в который передается коллекция содержащая список экземпляров классов,
    имп интерфейс MenuCommand

    у этих элементов мы вызываем метод getMenuName() который возвращает нам название каждого метода

    и затем в зависти от выбора пункта меню - вызываем метод execute() у соответствующего элемента коллекции
     */

    private final List<MenuCommand> commands;

    public UserMenu(List<MenuCommand> commands) {
        this.commands = commands;
    }

    public void startUserMenu(){
        while (true){
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(i + ". " + commands.get(i).getMenuName());
            }
            System.out.println("Make your choice:");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            commands.get(userInput).executeCommand();
        }
    }

}

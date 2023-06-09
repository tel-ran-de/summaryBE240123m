package summary8.project1.console;



import summary8.project1.core.AddToDoService;
import summary8.project1.core.FindAllToDoService;
import summary8.project1.dto.AddToDoRequest;
import summary8.project1.repository.ArrayListToDoRepository;
import summary8.project1.repository.ToDoRepository;

import java.util.Scanner;

public class ConsoleUI {

    private ToDoRepository repository = new ArrayListToDoRepository();
    private AddToDoService addTodoService = new AddToDoService(repository);
    private FindAllToDoService findAllToDoService = new FindAllToDoService(repository);





    public void execute(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.println("1. Create task");
                System.out.println("2. find task by id");
                System.out.println("3. Exit");

                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        createTask();
                        break;
                    case 2:
                        findTask();
                        break;
                    case 3: return;
                }
            } catch (Exception e) {
                System.out.println("Error! Please try again.");
            }
        }
    }

    private void createTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();

        var request = new AddToDoRequest();
        request.setName(name);
        request.setDescription(description);

        var response = addTodoService.add(request);

        System.out.println("Received response: " + response);


    }

    private void findTask() {
        var response = findAllToDoService.findAll();
        System.out.println(response);

    }


}

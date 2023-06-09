package summary8.project1.console;



import summary8.project1.core.AddToDoService;
import summary8.project1.dto.AddToDoRequest;

import java.util.Scanner;

public class AddToDoUIAction implements UIAction {

    private final AddToDoService addToDoService;

    public AddToDoUIAction(AddToDoService addToDoService) {
        this.addToDoService = addToDoService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();

        var request = new AddToDoRequest();
        request.setName(name);
        request.setDescription(description);

        var response = addToDoService.add(request);

        System.out.println("Received response: " + response);


    }

    @Override
    public String getActionName() {
        return "Add ToDo";
    }
}

package summary8.project1;



import summary8.project1.console.*;
import summary8.project1.core.AddToDoService;
import summary8.project1.core.FindAllToDoService;
import summary8.project1.repository.ArrayListToDoRepository;
import summary8.project1.repository.ToDoRepository;

import java.util.ArrayList;
import java.util.List;

public class MyProjectApp {
    public static void main(String[] args) {
        ToDoRepository repository = new ArrayListToDoRepository();
        AddToDoService addTodoService = new AddToDoService(repository);
        FindAllToDoService findAllToDoService = new FindAllToDoService(repository);

        AddToDoUIAction addToDoUIAction = new AddToDoUIAction(addTodoService);
        FindToDoUIAction findToDoUIAction = new FindToDoUIAction(findAllToDoService);
        ExitUIAction exitUIAction = new ExitUIAction();

        List<UIAction> uiActions = new ArrayList<>();
        uiActions.add(addToDoUIAction);
        uiActions.add(findToDoUIAction);
        uiActions.add(exitUIAction);

        UIMenu uiMenu = new UIMenu(uiActions);

        uiMenu.startUI();

    }
}

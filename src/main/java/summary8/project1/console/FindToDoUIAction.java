package summary8.project1.console;


import summary8.project1.core.FindAllToDoService;

public class FindToDoUIAction implements UIAction {

    private final FindAllToDoService findAllToDoService;

    public FindToDoUIAction(FindAllToDoService findAllToDoService) {
        this.findAllToDoService = findAllToDoService;
    }


    @Override
    public void execute() {
        var response = findAllToDoService.findAll();
        System.out.println(response);

    }

    @Override
    public String getActionName() {
        return "Find All ToDo";
    }
}

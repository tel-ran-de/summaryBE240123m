package summary6.smallProject.ui;

public class ExitMenuCommand implements MenuCommand{
    @Override
    public void executeCommand() {
        System.out.println("bye-bye");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit";
    }
}

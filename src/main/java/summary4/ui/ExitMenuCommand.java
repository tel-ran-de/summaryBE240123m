package summary4.ui;

public class ExitMenuCommand implements MenuCommand{
    @Override
    public void executeCommand() {
        System.out.println("Bye-bye!");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit";
    }
}

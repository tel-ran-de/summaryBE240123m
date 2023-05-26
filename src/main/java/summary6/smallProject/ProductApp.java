package summary6.smallProject;

import summary6.smallProject.businessLogic.ProductService;
import summary6.smallProject.database.ProductRepository;
import summary6.smallProject.database.ProductRepositoryImpl;
import summary6.smallProject.ui.*;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepositoryImpl();
        ProductService service = new ProductService(repository);

        AddProduct addProduct = new AddProduct(service);
        GetAllProducts getAllProducts = new GetAllProducts(service);
        ExitMenuCommand exitMenuCommand = new ExitMenuCommand();

        List<MenuCommand> menuCommands = new ArrayList<>();
        menuCommands.add(addProduct);
        menuCommands.add(getAllProducts);
        menuCommands.add(exitMenuCommand);

        UserMenu ui = new UserMenu(menuCommands);

        ui.startUserMenu();


//        UserMenuStart menu = new UserMenuStart(service);
//
//        menu.startUserMenu();

    }
}

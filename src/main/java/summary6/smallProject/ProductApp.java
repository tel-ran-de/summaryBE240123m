package summary6.smallProject;

import summary6.smallProject.businessLogic.ProductService;
import summary6.smallProject.database.ProductRepository;
import summary6.smallProject.database.ProductRepositoryImpl;
import summary6.smallProject.ui.UserMenuStart;

public class ProductApp {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepositoryImpl();
        ProductService service = new ProductService(repository);

        UserMenuStart menu = new UserMenuStart(service);

        menu.startUserMenu();
    }
}

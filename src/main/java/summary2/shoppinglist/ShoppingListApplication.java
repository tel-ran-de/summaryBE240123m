package summary2.shoppinglist;


import summary2.shoppinglist.businesslogic.ProductService;
import summary2.shoppinglist.database.ProductRepository;
import summary2.shoppinglist.database.ProductRepositoryArrayImpl;
import summary2.shoppinglist.ui.*;

class ShoppingListApplication {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryArrayImpl();

        ProductService service = new ProductService(productRepository);

        AddProduct addProduct = new AddProduct(service);
        GetAllProducts getAllProducts = new GetAllProducts(service);
        DeleteProduct deleteProduct = new DeleteProduct(service);
        ExitMenuCommand exitMenuCommand = new ExitMenuCommand();

        MenuCommand[] menuCommands = {
                addProduct,
                getAllProducts,
                deleteProduct,
                exitMenuCommand
        };

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();
    }
}

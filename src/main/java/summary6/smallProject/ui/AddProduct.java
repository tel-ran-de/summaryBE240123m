package summary6.smallProject.ui;

import summary6.smallProject.businessLogic.ProductService;
import summary6.smallProject.entity.Product;

import java.util.Scanner;

public class AddProduct implements MenuCommand{

    private final ProductService service;

    private Long id = 1L;

    public AddProduct(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter product price: ");
        Double price = scanner.nextDouble();

        Product product = new Product(name,price);
        product.setId(id++);

        service.addProduct(product);
    }

    @Override
    public String getMenuName() {
        return "Add product";
    }
}

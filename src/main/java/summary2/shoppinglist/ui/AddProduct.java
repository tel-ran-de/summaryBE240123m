package summary2.shoppinglist.ui;


import summary2.shoppinglist.businesslogic.ProductService;
import summary2.shoppinglist.domain.Product;

import java.math.BigDecimal;
import java.util.Scanner;

public class AddProduct implements MenuCommand {

    private final ProductService service;

    public AddProduct(ProductService service) {
        this.service = service;
    }


    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product name:");
        String name = scanner.nextLine();
        System.out.println("Please enter product price:");
        String stringPrice = scanner.nextLine();
        BigDecimal price = new BigDecimal(stringPrice);
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        service.addProduct(product);
    }

    @Override
    public String getMenuName() {
        return "Add product";
    }
}

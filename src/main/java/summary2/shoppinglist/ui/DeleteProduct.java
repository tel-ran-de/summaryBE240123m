package summary2.shoppinglist.ui;


import summary2.shoppinglist.businesslogic.ProductService;
import summary2.shoppinglist.domain.Product;

import java.math.BigDecimal;
import java.util.Scanner;

public class DeleteProduct implements MenuCommand {

    private final ProductService service;

    public DeleteProduct(ProductService service) {
        this.service = service;
    }


    @Override
    public void executeCommand() {

    }

    @Override
    public String getMenuName() {
        return "Delete product";
    }
}

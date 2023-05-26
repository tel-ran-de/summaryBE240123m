package summary6.smallProject.businessLogic;

import summary6.smallProject.database.ProductRepository;
import summary6.smallProject.entity.Product;

import java.util.List;

public class ProductService {

    private final ProductRepository database;

    public ProductService(ProductRepository database) {
        this.database = database;
    }

    public void addProduct(Product product) {
        // 1 step - Validation
        // check field(name, price)
        // validation rule:
        // name must not be null
        // name length 3-15
        // price > 0
        //price not null
        // 2 step - call repository and put data

        database.add(product);
    };

    public List<Product> findAll(){
        return database.findAll();
    }


}

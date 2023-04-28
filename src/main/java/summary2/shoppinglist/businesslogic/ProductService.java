package summary2.shoppinglist.businesslogic;


import summary2.shoppinglist.database.ProductRepository;
import summary2.shoppinglist.domain.Product;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        // 1
        //check field (name, price)
        //validation rules:
        //name length 3-15
        //name must not be null
        //price > 0
        //price not null
        // 2
        //call repository
        productRepository.add(product);
    }

    public Product[] findAll() {
        return productRepository.findAll();
    }
}

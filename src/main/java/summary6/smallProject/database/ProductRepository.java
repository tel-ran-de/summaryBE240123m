package summary6.smallProject.database;

import summary6.smallProject.entity.Product;

import java.util.List;

public interface ProductRepository {

    void add(Product product);

    List<Product> findAll();


}

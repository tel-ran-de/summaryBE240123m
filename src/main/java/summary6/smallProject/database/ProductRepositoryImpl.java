package summary6.smallProject.database;

import summary6.smallProject.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{

    private List<Product> database = new ArrayList<>();
    @Override
    public void add(Product product) {
        database.add(product);
    }

    @Override
    public List<Product> findAll() {
        return database;
    }
}

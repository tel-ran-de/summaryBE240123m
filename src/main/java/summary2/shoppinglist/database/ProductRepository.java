package summary2.shoppinglist.database;


import summary2.shoppinglist.domain.Product;

public interface ProductRepository {

    void add(Product product);

    Product[] findAll();
}

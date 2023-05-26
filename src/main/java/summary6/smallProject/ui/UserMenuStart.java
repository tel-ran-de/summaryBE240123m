package summary6.smallProject.ui;

import summary6.smallProject.businessLogic.ProductService;
import summary6.smallProject.entity.Product;

import java.util.Scanner;

public class UserMenuStart {

    private final ProductService service;

    private Long id = 0L;

    public UserMenuStart(ProductService service) {
        this.service = service;
    }

    public void startUserMenu() {

            while (true){
                printMenu();
                int choice = makeChoice();

                switch (choice) {
                    case 1:
                        addNewProduct();
                        break;
                    case 2:
                        findAll();
                        break;
                    case 3: return;
                }
            }
        }

        private void printMenu(){
            System.out.println("***********");
            System.out.println("Please make your choice:");
            System.out.println("1. Add new product");
            System.out.println("2. Find all product");
            System.out.println("3. Exit");
        }

        private int makeChoice(){
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        private void addNewProduct(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter product name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter product price: ");
            Double price = scanner.nextDouble();

            Product product = new Product(name,price);
            product.setId(id++);

            service.addProduct(product);
        }

    private void findAll(){
        System.out.println(service.findAll());
    }
}

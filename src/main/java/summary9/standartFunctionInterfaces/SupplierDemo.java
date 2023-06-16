package summary9.standartFunctionInterfaces;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<User> userFactory = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter user name:");
            String name = scanner.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("User 1 name: " + user1.getName());
        System.out.println("User 2 name: " + user2.getName());
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

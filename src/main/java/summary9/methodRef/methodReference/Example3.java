package summary9.methodRef.methodReference;

public class Example3 {
    public static void main(String[] args) {
        UserFactory userFactory = User::new;

        UserFactory user1 = new UserFactory() {
            @Override
            public User create(String name, String surname) {
                return new User(name,surname);
            }
        };
        User user = userFactory.create("John", "Smith");


    }
}

interface UserFactory {
    User create(String name, String surname);
}

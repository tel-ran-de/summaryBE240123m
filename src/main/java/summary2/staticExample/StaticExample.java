package summary2.staticExample;

public class StaticExample {
    public static void main(String[] args) {

        StaticVar olga = new StaticVar();
        StaticVar alex = new StaticVar();

        olga.name = "Olga";
        alex.name = "Alex";

        olga.town = "Berlin";

        System.out.println(olga);

        alex.town = "Leipzig";

        System.out.println(alex);

        System.out.println(olga);


        StaticVar.printHello();


    }

}

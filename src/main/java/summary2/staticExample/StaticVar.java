package summary2.staticExample;

public class StaticVar {

    String name;

    static String town;

    @Override
    public String toString() {
        return "StaticVar{" +
                "name='" + name + '\'' +
                "town='" + town + '\'' +
                '}';
    }

    static void printHello(){
        System.out.println("HELLO!!!!!");
    }
}

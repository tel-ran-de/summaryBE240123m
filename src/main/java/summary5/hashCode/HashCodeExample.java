package summary5.hashCode;

public class HashCodeExample {
    public static void main(String[] args) {
        Student student1 = new Student("Misha",21, "Berlin");
        Student student2 = new Student("Masha",21, "Berlin");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}

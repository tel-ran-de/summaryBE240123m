package summary2;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }
    public Author(Author author){
        this.name = author.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}

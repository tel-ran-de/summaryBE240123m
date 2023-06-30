package summary11.streamPractice1;

public class CatDetails {
    private String name;
    private String description;

    public CatDetails() {
    }

    public CatDetails(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CatDetails{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

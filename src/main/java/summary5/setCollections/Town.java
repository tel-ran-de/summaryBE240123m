package summary5.setCollections;

import java.util.Objects;

public class Town {
    String name;
    String country;
    int population;

    public Town(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return Objects.equals(name, town.name) && Objects.equals(country, town.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public String toString() {
        return "\nTown{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}

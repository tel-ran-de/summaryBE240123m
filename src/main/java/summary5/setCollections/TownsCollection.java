package summary5.setCollections;

import java.util.HashSet;
import java.util.Set;

public class TownsCollection {
    public static void main(String[] args) {
        Set<Town> towns = new HashSet<>();

        Town town1 = new Town("Berlin", "Germany", 3600000);
        Town town2 = new Town("Paris", "France", 5000000);
        Town town3 = new Town("Munich", "Germany", 2500000);
        Town town4 = new Town("Berlin", "Germany", 3800000);

        towns.add(town1);
        towns.add(town2);
        towns.add(town3);
        //towns.add(town4);

        System.out.println(towns);

        String searchTown = "Berlin";
        String searchCountry = "Germany";
        int newPopulation = 3800000;

        Town changeTown = new Town(searchTown,searchCountry,newPopulation);

            if (towns.add(changeTown) == false){
                System.out.println("already exist!");
                for (Town town : towns) {

                    if (town.hashCode() == changeTown.hashCode()){
                        town.population = 4000000;
                    }
                }
            } else {
                System.out.println("add success!");
            }

        System.out.println(towns);




    }
}

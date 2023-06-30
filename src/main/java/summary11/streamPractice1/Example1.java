package summary11.streamPractice1;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    private static int counter;

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik", "brit", "red", 2));
        cats.add(new Cat("Murzik", "brit", "red", 3));
        cats.add(new Cat("Lastochka", "brit", "red", 4));
        cats.add(new Cat("Dexter", "brit", "red", 3));
        cats.add(new Cat("Lucky", "brit", "red", 2));

        List<CatDetails> catDetails = new ArrayList<>();

        for (int i = 0; i < cats.size(); i++) {
            Cat myCat = cats.get(i);
            catDetails.add(new CatDetails(myCat.getName(), "detail " + i));
        }

        System.out.println(catDetails);
//==============================================================

        List<CatDetails> catDetailsStream = new ArrayList<>();

        catDetailsStream = cats.stream()
                .filter(cat -> cat.getAge() <= 3)
                .map(cat -> converter(cat))
//                .map(cat -> new CatDetails(cat.getName(), "details"))
                .toList();

        System.out.println(catDetailsStream);


        List<Cat> sortedCats = cats.stream()
                .sorted((o1,o2) -> o2.getName().compareTo(o1.getName()))
                .toList();
        System.out.println(sortedCats);


    }

    private static CatDetails converter(Cat cat) {
        counter++;
        CatDetails catDetails = new CatDetails(cat.getName(), "Description " + counter);
        return catDetails;
    }

}

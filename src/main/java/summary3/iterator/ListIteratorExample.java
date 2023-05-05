package summary3.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
       // Cat begemot = new Cat("Begemot");
        Cat lastochka = new Cat("Lastochka");
        Cat pushok = new Cat("Pushok");

        cats.add(murzik);
        cats.add(barsik);
        cats.add(new Cat("Begemot"));
        cats.add(new Cat("Begemot"));
        cats.add(new Cat("Begemot"));
        cats.add(lastochka);
        cats.add(pushok);


        System.out.println(cats);
        //--------- будем использовать list итератор ---------

        ListIterator<Cat> catListIterator = cats.listIterator();


        while (catListIterator.hasNext()) {
            Cat tempCat = catListIterator.next();
            System.out.println(tempCat);

            if (tempCat.getName().equals("Begemot")){
                System.out.println("Find equals");
                catListIterator.remove();
                System.out.println("Delete element!");
                catListIterator.add(new Cat("Burbon"));
            }
        }

        System.out.println("End of listIterator.");
        System.out.println("Start back");

        while (catListIterator.hasPrevious()){
            Cat tempCat = catListIterator.previous();
            System.out.println(tempCat);
        }

    }
}

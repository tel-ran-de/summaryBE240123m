package summary5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList <Cat> cats = new ArrayList<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
        //Cat begemot = new Cat("Begemot");
        Cat pushok = new Cat("Pushok");
        Cat dexter = new Cat("Dexter");

        cats.add(murzik);
        cats.add(barsik);
        cats.add(new Cat("Begemot"));
        cats.add(pushok);
        cats.add(dexter);



// ----------   Use LISTITERATOR -----------

        ListIterator<Cat> catIterator = cats.listIterator();

        System.out.println("Use  list iterator and try delete one element from our collection:");

        while(catIterator.hasNext()){
            Cat tempCat = catIterator.next();
            //System.out.println(tempCat);

            if (tempCat.getName().equals("Begemot")){
                System.out.println("equal and remove Begemot");
                catIterator.remove();
                System.out.println("add new cat - Burbon");
                catIterator.add(new Cat("Burbon"));
            }
        }

        System.out.println("================================");
        System.out.println(cats);

        while (catIterator.hasPrevious()){
            System.out.println(catIterator.previous());
        }


    }
}

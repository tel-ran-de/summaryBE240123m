package summary3.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
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
        cats.add(lastochka);
        cats.add(pushok);


      //  System.out.println(cats);

        //cats.remove(begemot);


        // ТАК НЕ РАБОТАЕТ!!! - МОДИФИЦИРОВАТЬ КОЛЛЕКЦИЮ ВНУТРИ ЦИКЛА НЕ ВОЗМОЖНО
        /*
        выдается ошибка
    Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at summary3.iterator.IteratorExample.main(IteratorExample.java:26)

         */
//        for (Cat cat : cats) {
//            System.out.println(cat);
//            if (cat.getName().equals("Begemot")){
//                System.out.println("FIND!");
//                cats.remove(cat);
//                cats.add(new Cat("Burbon"));
//            }
//        }


        //--------- будем использовать итератор ---------

        Iterator<Cat> catIterator = cats.iterator();

        while (catIterator.hasNext()) {
            Cat tempCat = catIterator.next();
            System.out.println(tempCat);
        }

        Iterator<Cat> catIterator2 = cats.iterator();

        while (catIterator2.hasNext()) {
            Cat tempCat = catIterator2.next();
            System.out.println(tempCat);

            if (tempCat.getName().equals("Begemot")){
                System.out.println("Find equals");
                catIterator2.remove();
                System.out.println("Delete element!");
            }
        }

        System.out.println(cats);

        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}

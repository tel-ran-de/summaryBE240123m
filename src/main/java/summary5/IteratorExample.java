package summary5;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
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

       // System.out.println(cats);

        /*
        мы можем удалить элемент нашей коллекции двумя способами

        1) - явно указывая ссылку на экземпляр класса который мы хотим
        удалить из коллекции
        cats.remove(begemot);

        но это возмодно только если у нас заранее в момент создания этого
        экземпляра класса мы сохранили в переменной эту ссылку


                2) пройтисб по коллекции, сравнить параметр поиска и
                если совпадает с критерием - удалить
         */

//        for (Cat cat : cats){
//            if (cat.getName().equals("Begemot")){
//                cats.remove(cat);
//            }
//        }

        // ОШИБКА!! поттому что в момент прохождения по коллекции мы пытаемся ее модифицировать!!


// ----------   Use ITERATOR -----------

        Iterator<Cat> catIterator = cats.iterator();

        System.out.println("Use first iterator and print all elements our collection:");

        while(catIterator.hasNext()){
            System.out.println(catIterator.next());
        }

        System.out.println("================================");


        catIterator = cats.iterator();

        System.out.println("Use second iterator and try delete one element from our collection:");

        while(catIterator.hasNext()){
            Cat tempCat = catIterator.next();
            System.out.println(tempCat);

            if (tempCat.getName().equals("Begemot")){
                System.out.println("equal");
                catIterator.remove();
            }
        }

        System.out.println("================================");



    }
}

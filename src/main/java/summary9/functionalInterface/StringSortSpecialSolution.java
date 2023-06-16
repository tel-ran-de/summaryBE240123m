package summary9.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortSpecialSolution {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("DD");
        myList.add("FFF");
        myList.add("AAA");
        myList.add("CC");
        myList.add("E");
        myList.add("BBBBBBB");

        System.out.println(myList);

        // Step 1

//        StringLengthComparator myComparator = new StringLengthComparator();
//
//        Collections.sort(myList, myComparator);

        // Step 2


        //Collections.sort(myList, new StringLengthComparator());

        //Step 3

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(myList, comparator);

        System.out.println(myList);



    }
}

package summary4.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("list1");

        List<String> stringlinkedList = new LinkedList<>();
        stringlinkedList.add("list2");

        List<List<String>> superList = new LinkedList<>();

        superList.add(stringArrayList);
        superList.add(stringlinkedList);

        System.out.println(superList);






    }
}

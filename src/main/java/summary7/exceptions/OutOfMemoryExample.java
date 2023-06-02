package summary7.exceptions;

import java.util.ArrayList;

public class OutOfMemoryExample {
    public static void main(String[] args) {


        OutOfMemoryExample no = new OutOfMemoryExample();
        ArrayList<String[]> newArrayList = new ArrayList<>();


        int count = 0;

        while (true) {
            newArrayList.add(no.newStringArray());
            count++;
        }
    }

    String[] newStringArray() {
        String[] newArray = new String[1_000_000];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = " aksfhgvlkshvlkshjdvlkasbdvlkbs`vkl`d ";
        }
        return newArray;
    }
}

package summary10.stream;

import java.util.Arrays;

public class StreamExample1 {
    public static void main(String[] args) {

       int[] array = {90,100,50,120,60,150,70,80,90,100,11,120};

       int count = 0;
        for (int i : array) {
            if (i >= 90) continue;
            i = i + 10;
            count++;
            if (count > 3) break;
            System.out.println(i);
        }



        Arrays.stream(array)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3)
                .forEach(System.out::println);


        System.out.println(Arrays.toString(array));

    }
}

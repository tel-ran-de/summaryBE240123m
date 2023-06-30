package summary11.streamPractice2;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{11,12,15},{21,21,25}};

        // м ы хотим получить массив {1,2,3,11,12,15,21,21,25}

        int [] newArray1 = new int[9];
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArray1[count] = arr[i][j];
                count++;
            }
        }

        System.out.println(Arrays.toString(newArray1));

        int[] newArray2 = Arrays.stream(arr)
                .flatMapToInt(arrElement -> Arrays.stream(arrElement))
                .toArray();

        System.out.println(Arrays.toString(newArray2));


        String[][] arrayString = {{"a","b","c"},{"c","d","e"},{"c","d","e"},{"e","f","g"},{"g","h","i"}};

        Arrays.stream(arrayString)
                .flatMap(streamElement -> Arrays.stream(streamElement))
                .distinct()
                .forEach(x -> System.out.print(x + ", "));

        System.out.println();

        List<String> stringCollection = Arrays.stream(arrayString)
                .flatMap(streamElement -> Arrays.stream(streamElement))
                .distinct()
                .sorted((o1,o2) -> o2.compareTo(o1))
                .toList();

        System.out.println(stringCollection);


    }
}

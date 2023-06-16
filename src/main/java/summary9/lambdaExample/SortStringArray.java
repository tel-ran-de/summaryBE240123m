package summary9.lambdaExample;

public class SortStringArray {
    public static void main(String[] args) {

        ISortString ref = (stringArray) -> {
            String tmp;
            for (int i = 0; i < stringArray.length - 1; i++) {
                for (int j = i; j  >= 0; j--) {
                    if (stringArray[j].compareTo(stringArray[j+1]) > 0) {
                        tmp = stringArray[j];
                        stringArray[j] = stringArray[j+1];
                        stringArray[j+1] = tmp;
                     }
                }
            }
        };

        String[] strings = {"DDD","HHH","EEE","FFF","BBB","DDD","CCC","AAA","GGG"};

        SortMethod sortMethod = new SortMethod();
        sortMethod.sortString(strings,ref);

        ISortString ref2 = (stringArray) -> {
            String tmp;
            for (int i = 0; i < stringArray.length - 1; i++) {
                for (int j = i; j  >= 0; j--) {
                    if (stringArray[j].compareTo(stringArray[j+1]) < 0) {
                        tmp = stringArray[j];
                        stringArray[j] = stringArray[j+1];
                        stringArray[j+1] = tmp;
                    }
                }
            }
        };

        sortMethod.sortString(strings,ref2);



    }
}

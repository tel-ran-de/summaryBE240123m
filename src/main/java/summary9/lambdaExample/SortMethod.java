package summary9.lambdaExample;

public class SortMethod {

    void sortString(String[] arrayString, ISortString ref) {
        ref.sort(arrayString);

        for (String stringElement : arrayString) {
            System.out.println(stringElement);
        }
    }
}

package summary7.ourExceptions;

public class Validation {

    boolean validationPriceLessZero(int price) {
        boolean isCorrect = true;
        if (price < 0) {
            isCorrect = false;
        }
        return isCorrect;
    }

}

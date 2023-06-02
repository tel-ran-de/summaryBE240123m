package summary7.ourExceptions;

public class ProductValidationException extends RuntimeException{

    public ProductValidationException(String message) {
        super(message);
    }
}

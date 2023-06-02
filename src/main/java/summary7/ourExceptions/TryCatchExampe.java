package summary7.ourExceptions;

public class TryCatchExampe {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");

            // ввод данных от пользователя для записи в базу данных

            String productName = "milkmilk";

            // валидация этих данных
            validateProductName(productName);

            // запись данных в базу данных
            /*
            if (проверка прошла успешно) то запись в базу
            else ...... - мы должны как-то отреагировать на эту ситуацию
             */

            System.out.println("4");

        } catch (ProductValidationException e) {
            System.out.println("Validation failed, reason: " + e.getMessage());
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("Program finished!");
    }

    static void validateProductName(String name) {
        if (name.length() < 10 ){
            throw new ProductValidationException("Product name should be greater that 10");
        }

    }
}

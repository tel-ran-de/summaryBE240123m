package summary7.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(n + " is a " + (99 % n == 0) + " factor of 99");
        } catch (ArithmeticException e) {
            System.out.println(" Arithmetic " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input data error!" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Wrong format data");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Finish");
    }
}

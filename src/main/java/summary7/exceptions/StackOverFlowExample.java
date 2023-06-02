package summary7.exceptions;

import java.util.ArrayList;

public class StackOverFlowExample {
    public static void main(String[] args) {

        StackOverFlowExample no = new StackOverFlowExample();

        int count = 0;

        while (true) {
            count++;
            System.out.print(count + ", ");
            no.stackOff(count);
        }
    }

    public void stackOff(int count) {
        count++;
        System.out.print(count + ", ");

        stackOff(count);
    }
}

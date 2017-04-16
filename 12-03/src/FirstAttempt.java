/*
 * This code does NOT work, but I’m not discouraged.
 */
import java.util.Scanner;

class FirstAttempt {

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        char symbol = ' ';

        while (symbol != '@') {
            symbol = myScanner.findWithinHorizon(".",0)
                                              .charAt(0);
            System.out.print(symbol);
        }

        System.out.println();
    }
}

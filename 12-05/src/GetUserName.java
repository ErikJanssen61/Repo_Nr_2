/*
 * This code works correctly!
 */
import java.util.Scanner;

class GetUserName {

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        char symbol;

        symbol = myScanner.findWithinHorizon(".",0)
                                          .charAt(0);

        while (symbol != '@') {
            System.out.print(symbol);
            symbol = myScanner.findWithinHorizon(".",0)
                                              .charAt(0);
        }

        System.out.println();
        myScanner.close();
    }
}

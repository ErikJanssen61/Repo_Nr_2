import java.util.Scanner;
import static java.lang.System.out;

/*
 * 18-02 tweede poging
 */

class ProcessMoreData {

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        String fullName;
        double amount;
        boolean taxable;
        double total;

        out.print("Customer's full name: ");
        fullName = myScanner.nextLine();
        out.print("Amount: ");
        amount = myScanner.nextDouble();
        out.print("Taxable? (true/false) ");
        taxable = myScanner.nextBoolean();

        if (taxable) {
            total = amount * 1.05;
        } else {
            total = amount;
        }

        out.println();
        out.print("The total for ");
        out.print(fullName);
        out.print(" is ");
        out.print(total);
        out.println(".");
        
        myScanner.close();
    }
}

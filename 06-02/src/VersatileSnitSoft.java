import java.util.Scanner;

class VersatileSnitSoft {

   public static void main(String args[]) {
      Scanner myScanner = new Scanner(System.in);
      double amount;

      System.out.print("What's the price of a CD-ROM? ");
      amount = myScanner.nextDouble();
      amount = amount + 25.00;

      System.out.print("We will bill $");
      System.out.print(amount);
      System.out.println(" to your credit card.");
   }
}

import java.util.Scanner;

class ComputeTotal {
    
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        double unitPrice, quantity, total;

        unitPrice = myScanner.nextDouble();
        quantity = myScanner.nextInt();

        total = unitPrice * quantity;

        System.out.println(total);
    }
}

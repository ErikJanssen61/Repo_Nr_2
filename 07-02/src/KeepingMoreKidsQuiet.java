import java.util.Scanner;

class KeepingMoreKidsQuiet {

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        int gumballs;
        int kids;
        int gumballsPerKid;
      
        System.out.print
            ("How many gumballs? How many kids? ");
         
        gumballs = myScanner.nextInt();      
        kids = myScanner.nextInt();
      
        gumballsPerKid = gumballs / kids;
      
        System.out.print("Each kid gets ");
        System.out.print(gumballsPerKid);
        System.out.println(" gumballs.");
    }
}

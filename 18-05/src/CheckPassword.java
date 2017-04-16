/*
 * This program works!
 */
import java.util.Scanner;
import static java.lang.System.out;

class CheckPassword {

    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        String password = "swordfish";
        String userInput;

        out.print("What's the password? ");
        userInput = myScanner.next();

        if (password.equals(userInput)) {
            out.println("You're okay!");
        } else {
            out.println("You're a menace.");
        }
    }
}

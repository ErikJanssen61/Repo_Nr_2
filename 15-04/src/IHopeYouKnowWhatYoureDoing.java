/*
 * DISCLAIMER: Neither the author nor Wiley Publishing,
 * Inc., nor anyone else even remotely connected with the
 * creation of this book, assumes any responsibility
 * for any damage of any kind due to the use of this code,
 * or the use of any work derived from this code,
 * including any work created partially or in full by 
 * the reader.
 *
 * Sign here:_______________________________
 */

import java.util.Scanner;
import java.io.IOException;

class IHopeYouKnowWhatYoureDoing {

  public static void main(String args[])
      throws IOException {

    Scanner myScanner = new Scanner(System.in);
    char reply;

    do {
      System.out.print("Reply with Y or N...");
      System.out.print("  Delete all .keep files? ");
      reply = 
        myScanner.findWithinHorizon(".", 0).charAt(0);
    } while (reply != 'Y' && reply != 'N');

    if (reply == 'Y') {

      String opSystem = System.getProperty("os.name");
      
      if (opSystem.contains("Windows")) {
        
        Runtime.getRuntime().exec("cmd /c del *.keep");
        
      } else if (opSystem.contains("Mac")) {
        
        Runtime.getRuntime().exec(
            new String[] { "/bin/sh", "-c",
                "rm -f *.keep" });
      }
    }
  }
}

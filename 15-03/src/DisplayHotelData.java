import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

/*
 * 15-03
 */

class DisplayHotelData {

   public static void main(String args[]) 
      throws FileNotFoundException 		{

      Scanner diskScanner = new Scanner(new File("hotelData"));

      for (int floor = 1; floor <= 9; floor++) {
    	  out.print("Floor ");
          out.print(floor);
          out.print(":  |");
         
         for (int roomNum = 1; roomNum <= 20; roomNum++) 
         {	 Scanner diskScanner1 = new Scanner(new File("hotelData"));
        	 out.print(diskScanner1.nextInt());
             out.print('|');
          }

         out.println();
         diskScanner.close();
         //diskScanner1.close();
      }
   }
}
/*
public static void main(String args[]) 
	      throws FileNotFoundException {

	         for (int floor = 1; floor <= 5; floor++) {
	         out.print("Floor ");
	         out.print(floor);
	         out.print(":  ");
	         
		         for (int roomNum = 1; roomNum <= 10; roomNum++) {
		            out.print(roomNum);
		            out.print('|');
		            //roomNum = 1;
		            
			         for (int subNum = 1; subNum <=3; subNum++) {
			        	 out.print('/'); 
			        	 out.print(subNum);
			        	 out.print(' ');
			         }
	         }

	         out.println();
	         //diskScanner.close();
	      }
	   }
	}*/
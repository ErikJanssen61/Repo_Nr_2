import java.util.Scanner;

class CelsiusToFahrenheit {

  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    double celsius, fahrenheit;

    System.out.print("Enter the Celsius temperature: ");
    celsius = myScanner.nextDouble();

    fahrenheit = 9.0 / 5.0 * celsius + 32.0;

    System.out.print("Room temperature? ");
    System.out.println(fahrenheit == 69.8);
  }
}

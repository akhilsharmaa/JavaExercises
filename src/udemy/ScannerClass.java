package udemy;
import java.util.Scanner;


public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");

        String x  = scanner.nextLine();

        System.out.println("Enter a number");
        float y  = scanner.nextInt();

        System.out.println("Your typed number is " + y );

        System.out.println("Your name is " + x +
                "??");



    }

}

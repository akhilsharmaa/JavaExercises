package apnikaksha;

import java.util.Scanner;

public class LoopBreak1 {
    public static void main(String[] args) {

/*  Take user input until user give the Negative number */

        Scanner scanner = new Scanner(System.in);

       while (true){
           System.out.println("Enter the Negative number please");
           int inputNum = scanner.nextInt();

           if (inputNum <= 0 ){
               break;
           }else continue;

       }
        System.out.println("Thanks your negative number");

    }
}

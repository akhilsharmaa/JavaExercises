package udemy;
import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;


        while (true){

            System.out.println("Enter the Value");
            boolean check = sc.hasNextInt();

            // Max and Min Check
            if (check){
                int num = sc.nextInt(); // User input

                if (num > max){
                    max = max + num;
                }
                if (num < max){
                    min = num;
                }
            }
            else {
                break;
            }

        }

        System.out.println("Invalid Value");

        System.out.println(min + "= Minimum");
        System.out.println(max + "= Maximum__");

        sc.close();

    }
}

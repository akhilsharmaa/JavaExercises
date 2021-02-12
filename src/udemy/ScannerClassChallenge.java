package udemy;

import java.util.Scanner;

public class ScannerClassChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0;


        System.out.println("Enter the First Value");
        for (int i = 1 ; i <= 10 ; i++){


            boolean check = sc.hasNextInt();
            if (check){
                System.out.println("Enter " + i +  "th  Value to add");
                int x = sc.nextInt();
                y = y + x;
            }
            else
            {
                continue;
            }
            continue;
        }

        sc.close();

        System.out.println("Invalid Value");

        System.out.println("Your are outside of the Loop End");
        System.out.println(y+ " YOUR Result");

    }

}

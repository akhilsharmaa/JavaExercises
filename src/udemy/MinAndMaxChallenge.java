package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<Integer>();
//        numList.add(65);
//        numList.add(564);
//        numList.add(654);
//        numList.add(78);
//        numList.add(8);
//        System.out.println(numList);
//
//        System.out.println(check);
//        for (int count =  1 ; count < 5 ; count++){
//
//            boolean check = sc.hasNextInt();
//            System.out.println("Enter number");
//            int input = sc.nextInt();
//            numList.add(input);
//
//            System.out.println(check);
//
//        }

        boolean checkNum = sc.hasNextInt();

        if (checkNum){

            while (checkNum){
                System.out.println("Enter the value");
                int input = sc.nextInt();
                numList.add(input);

            }

        }
        else {
            sc.close();
            System.out.println("Invalid value");
        }


            System.out.println(numList);

    }
}

package udemy;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
//        int number = 9;
        long sol = 1;
        long result = 0;

        for (int i = 1 ; i < number ; i++){
            long x = sol * i;
            sol = x ;

            System.out.println(sol);
        }


    }
}

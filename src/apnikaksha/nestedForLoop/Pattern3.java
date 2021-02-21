package apnikaksha.nestedForLoop;

import java.util.Scanner;

/*
Working properly :)

 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

 */

public class Pattern3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int n = 7;

        for (int i = n ; i > 0 ; i--){
            for (int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

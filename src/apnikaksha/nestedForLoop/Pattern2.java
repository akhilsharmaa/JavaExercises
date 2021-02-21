package apnikaksha.nestedForLoop;

/*   To print

Working properly :)
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *

 */

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

         for (int i = 1 ; i < n ; i++){
             for (int count1 = 1; count1 <= i ; count1++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}

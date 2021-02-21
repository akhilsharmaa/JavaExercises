package apnikaksha.nestedForLoop;

import java.util.Scanner;

public class Pattern1 {
// Working properly :)

/*   To print the n x n
       *  *  *  *  *
       *  *  *  *  *
       *  *  *  *  *
       *  *  *  *  *
       *  *  *  *  *
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int firstLoop = 0 ; firstLoop < n ; firstLoop++){
            for (int secondLoop = 0; secondLoop < n ; secondLoop ++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }

}

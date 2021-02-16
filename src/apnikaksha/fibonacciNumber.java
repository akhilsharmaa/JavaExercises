package apnikaksha;

import java.util.Scanner;

public class fibonacciNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < n ; i++){


            int c = a +b ;
            System.out.println(c);

            a = b ;
            b = c ;

        }


    }

}

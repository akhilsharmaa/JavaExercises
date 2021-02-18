package apnikaksha;
import java.util.Scanner;

public class SeriesSum2 {
    public static void main(String[] args) {

 /*    We have to print the value of
    1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + 1/7 - 1/8...n  */
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        double result = 0 ;

        for (float i = 1; i < n ; i++){
            double x =  1/i;

            if(i%2 == 0){result -= x; }
            else result += x;
        }
        System.out.println(result + " re");
    }
}

package apnikaksha;

public class LoopContinue {
    public static void main(String[] args) {

/* Continue is use to skip something in
   a loop it do not end the loop but it
   only skip some part with some condition   */


/*   So in this loop it will print 1...40
     and skip to the 60 and print 61...100 */

        for(int i = 0; i <= 100 ; i ++){

            if (i >= 40 && i <= 60){
                continue;
            }

            System.out.println(i);
        }
    }
}

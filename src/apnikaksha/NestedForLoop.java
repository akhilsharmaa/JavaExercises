package apnikaksha;

public class NestedForLoop {
    public static void main(String[] args) {

//        Working properly :)
//    Created a loop inside a loop

        for(int i = 1 ; i <= 100 ; i++){
            for (int j = 1 ; j <= 20 ; j ++){
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}

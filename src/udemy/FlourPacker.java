package udemy;

public class FlourPacker {
    public static boolean canPack(int bigCount , int smallCount , int goal ){



        if (goal < ((bigCount * 5) + (smallCount))){
            System.out.println("Yes its done");
            return true;
        }
        else {
        System.out.println("No ,its not ");
        return false;}
    }

    public static void main(String[] args) {
        canPack(1,0,4);
    }

}

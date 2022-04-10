package object;
import java.util.Scanner;

public class Obj {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = a.nextInt();
        System.out.println("Enter the value of y: ");
        int y = a.nextInt();
        int z = x + y;
        System.out.println("The summation of x and y is: " + z);
    }
}

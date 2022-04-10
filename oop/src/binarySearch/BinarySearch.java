//searching an element from an array
package binarySearch;
import java.util.*;

public class BinarySearch {
    public static int calculateSum(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Summation is: "+ calculateSum(a, b));
    }
}

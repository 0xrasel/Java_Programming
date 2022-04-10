package evenOdd;
import java.util.ArrayList;
import java.util.Scanner;

//Taking input from user and find it's even and odd number from an array
public class EvenOdd {
    public static void main(String[] args) {
        //taking array size from user
        Scanner a = new Scanner(System.in);
        System.out.println("How many elements you want to take?\n");
        int n = a.nextInt();
        //declaring array
        int[] num = new int[n];
        ArrayList<Integer> arr1 = new ArrayList<>(); //for taking odd numbers
        ArrayList<Integer> arr2 = new ArrayList<>(); //for taking even numbers

        System.out.println("Enter the elements of the array: \n");

        //taking inputs and storing them in array
        for(int i=0; i<num.length; i++){
            num[i] = a.nextInt();
            //now traversing the array
            if (num[i] % 2 == 0) {
                arr2.add(num[i]);
            }
            else{
                arr1.add(num[i]);
            }
            }
        //printing odd numbers
        System.out.print("Odd numbers are: ");
        for(int number:arr1) {
            if(number.length < 0){
                System.out.println("None");
            }
            else {
                System.out.print(number + " ");
            }
        }
        //printing even numbers
        System.out.print("\nEven numbers are: ");
        for(int number:arr2) {
            if(arr2.size() <= 0){
                System.out.println("None");
            }
            else {
                System.out.print(number + " ");
            }
        }
    }
}

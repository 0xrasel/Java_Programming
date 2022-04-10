//Sorting Algorithm
package bubblesort;
import java.util.*;

public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = a.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = a.nextInt();
        }
        for(int i=1; i<n; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        printArray(arr);
    }
}




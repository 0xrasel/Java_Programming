package arrayop;
import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        int size, pos, item, i;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        size = a.nextInt();
        int arr[] = new int[size+1];
        System.out.print("Enter Array Elements: ");
        for(i=0; i<arr.length; i++) {
            arr[i] = a.nextInt();
        }
        System.out.print("Enter Array Location: ");
        pos = a.nextInt();
        System.out.print("Enter New Item: ");
        item = a.nextInt();
        for(i=size; i>pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = item;
        size++;
        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }

    }
}

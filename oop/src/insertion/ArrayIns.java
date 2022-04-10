package insertion;
import java.util.*;

public class ArrayIns {
    public static void main(String[] args) {
        int size, item, pos, i;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        size = x.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter Array Elements: ");
        for(i=0; i<size; i++){
            arr[i] = x.nextInt();
        }
        System.out.println("Enter The Location: ");
        pos = x.nextInt();
        System.out.println("Enter The Value: ");
        item = x.nextInt();
        for(i=size; pos<i; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = item;
        size++;
        for(i=0; i<size; i++){
            System.out.println(arr[i]+" ");
        }
    }
}

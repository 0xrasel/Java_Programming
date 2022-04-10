import java.io.*;
public class SquareString {
    static boolean isPerfectSquareString(String str){
        int summation = 0;
        int len = str.length();
        for(int i = 0; i < len; i++)
            summation += (int)str.charAt(i);
        long squareRoot = (long)Math.sqrt(summation);
        return((squareRoot)-Math.floor(squareRoot)==0);
    }
    public static void main(String[] args){
        String str = "aa";
        if(isPerfectSquareString(str))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}

import java.io.Console;


/*An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements. */
import java.util.*;
import java.io.*;
public class question1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            System.out.println("Enter the array element");
            arr[i] = sc.nextInt();
        }
        int ans = peakElement(arr, N);
        System.out.println("The final ans is: "+ ans);

    }
    public static int peakElement(int[] arr, int n) {
        int currentMax = 0;
        int idx = 0;
        for(int i=0; i<n; i++) {
            if(currentMax < arr[i]){
                idx = i;
            }
        }
        return idx;
    }
}

import java.util.*;
import java.io.*;
/*Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array. */

public class max_min_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            System.out.println("Enter the array element");
            arr[i] = sc.nextInt();
        }
        minMax(arr, N);    
    }
    public static void minMax(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The maximum element is: "+max);
        System.out.println("The minimumelement is: "+min);
    }
}

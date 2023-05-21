import java.util.*;
import java.io.*;
/*Given an array A of size N, print the reverse of it. */

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element in the array");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]+" ");
        }
        System.out.println();
        reverse(arr, n);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] reverse(int[] arr, int n) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int temp = arr[left];
            arr[left] = right;
            arr[right] = temp;
            left++;
            right --;
        }
        return arr;
    }
}

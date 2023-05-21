package ArraySort;
/*Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order. */
public class zeroOneTwoSort {
    public static void sort(int[] arr, int n){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int temp = 0;
        while(mid <= high){
            switch(arr[mid]){
                case 0:
                temp = arr[mid];
                arr[low] = temp;
                arr[mid] = temp;
                low++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        int n = 5;
        sort(arr, n);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

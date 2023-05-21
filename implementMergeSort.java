/*Given an array, sort it using merge sort.
 * Sample Input
2
5 4 2 5 3 1
3 11 4 200
Expected Output
1 2 3 4 5
4 11 200
 */


public class implementMergeSort {
    public static void merge(int[] arr, int l, int mid, int r){
        //Find the size of the two subarray
        int n1 = mid-l +1;
        int n2 = r - mid;
        //create temp array
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0; i<n1; i++){
            L[i] = arr[l+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[mid+1+j];
        }
        int i=0,j=0;
        int k = l;
        while(i < n1 && j<n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] arr, int l, int r){
        if(l < r){
            int mid = l +(r-l)/2;
            //sort first and second halve of the array.
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,11,4,200};
        sort(arr, 0, arr.length-1);
        print(arr);
    }
}

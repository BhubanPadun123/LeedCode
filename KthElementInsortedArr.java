/*
 * Given two sorted arrays A and B, and another value k, print the kth element of the resultant sorted array.

Example
A: [1, 2, 3, 4, 5, 6]
B: [3, 4, 4, 5, 6, 6]
Result: [1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6]
3rd element in the array is 3.
6th element in the array is 4.
 */
public class KthElementInsortedArr {
    public static int getKthElement(int[] arr1, int[] arr2, int k){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result[idx] = arr1[i];
                i++;
            }else{
                result[idx] = arr2[j];
                j++;
            }
            idx++;
        }
        while(i < arr1.length){
            result[idx] = arr1[i];
            idx++;
            i++;
        }
        while(j < arr2.length){
            result[idx] = arr2[j];
            j++;
            idx++;
        }
        int ans = 0;
        for(int m = 0; m<result.length; m++){
            if(m == k-1){
                ans = result[m];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,4,4,5,6,6};
        int k = 6;
        System.out.println(getKthElement(arr1, arr2, k));
    }
    
}

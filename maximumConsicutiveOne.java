/*
 * Given an array A, find the maximum number of consecutive 1s in the array.

Examples
A: [1, 1, 3, 2, 3, 1, 1, 1]
Max consecutive 1s: 3
 */

public class maximumConsicutiveOne {
    public static int getConsicutive(int[] arr){
        int maxOccured = 1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                maxOccured ++;
            }else{
                maxOccured = 1;
            }
        }
        return maxOccured;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,3,1,1,1};  
        System.out.println(getConsicutive(arr));      
    }
}

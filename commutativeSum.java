
/*The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
 * Initial Array: [1, 2, 3, 4]
Cumulative Sum: [1, 3, 6, 10]
 */
public class commutativeSum {
    public static int[] cumulative(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = cumulative(arr);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+"  ");
        }
    }
}

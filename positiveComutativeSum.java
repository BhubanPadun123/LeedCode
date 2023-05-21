import java.util.ArrayList;
import java.util.List;

/*The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
 * Initial Array: [1, -2, 3, 4, -6]
   Cumulative Sum: [1, -1, 2, 6, 0]
   Positive Cumulative Sum: [1, 2, 6]
 */


public class positiveComutativeSum {
    public static List<Integer> getComutative(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            
            arr[i] = arr[i]+arr[i-1];
        }
        for(int i=0;i<arr.length; i++){
            if(arr[i] > 0){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,-6};
        System.out.println(getComutative(arr));
    }
}

import java.util.ArrayList;
import java.util.List;

/*Given an array of integers, find the elements which have an even number of digits.
 * Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
   Answer: 42, 5775, 34, 45, 3556
 */


public class eventNumberDigit {
    public static List<Integer> getNumbers(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            String str = String.valueOf(arr[i]);
            if(str.length() % 2 == 0){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {42,564,5775,34,123,545,1,5,45,3556,23442};
        System.out.println(getNumbers(arr));
    }
}

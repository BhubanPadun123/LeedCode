/*For an array of integers nums, an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.
 * Array: [1, 2, 3, 2, 1]
Number of Identical Twins: 2
Explanation:
Identical Twins: [[1, 1], [2, 2]]
Indexes: (0, 4), (1, 3)
 */


public class identicalTwins {
    public static int getTwins(int[] arr){
        int twins = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    twins ++;
                }
            }
        }
        return twins;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(getTwins(arr));
    }
}

package MediumLevel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class minNoSwap {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] nums = {1,5,4,3,2};
        int[] arr = nums;
        Arrays.sort(nums);
        HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++){
            list.put(nums[i], i);
        }
        int count = 0;
        for(int i=0; i<nums.length; i++){
            System.out.println(list.get(arr[i]));
            while(list.get(nums[i]) != i){
                count ++;
                System.out.println(list.get(nums[i]));
            }
        }

    }
    public static int getMinSwap(int[] nums){
        int[] arr = nums;
        Arrays.sort(nums);
        HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++){
            list.put(nums[i], i);
        }
        int count = 0;
        for(int i=0; i<nums.length; i++){
            while(list.get(nums[i]) != i){
                count ++;

            }
        }
        return 0;

    }
}

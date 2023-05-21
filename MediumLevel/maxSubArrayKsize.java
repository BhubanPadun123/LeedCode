package MediumLevel;

import java.util.ArrayList;

public class maxSubArrayKsize {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,2,3,6};
        int k = 3;
        System.out.println(max_sub_array(arr, arr.length, k));
    }
    public static ArrayList<Integer> max_sub_array(int[] arr,int n, int k){


        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n-k; i++){
            int max_element = 0;
            if(arr[i] > arr[i+k] || arr[i] > arr[i+1] ){
                max_element = arr[i];
            }
            else if(arr[i+1] > arr[i] || arr[i+1] > arr[i+k]){
                max_element = arr[i];
            }
            else if(arr[i+k] > arr[i] || arr[i+k] > arr[i+1]){
                max_element = arr[i+k];
            }
            list.add(max_element);
        }
        return list;
    }
}

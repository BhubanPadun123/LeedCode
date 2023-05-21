package gfg.Array;

import java.util.ArrayList;

public class reverse {
    public void reverseGroup(ArrayList<Integer> arr, int n, int k){
        int start = 0;
        while(start < n){
            int end = Math.min(start+k -1, n-1);
            for(int i=start; i < (start+end)/2 +1; i++){
                int temp = arr.get(i);
                arr.set(i, arr.get(start + end -1));
                arr.set(start+end-1, temp);
            }
            start += k;
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<6; i++){
            arr.set(i, i);
        }
        reverse list = new reverse();
        list.reverseGroup(arr, 5, 3);
    }
}

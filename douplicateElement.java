import java.util.ArrayList;
import java.util.Arrays;

public class douplicateElement {
    public static ArrayList<Integer> duplicate(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i:arr){
            i = Math.abs(i);
            if(arr[i-1]>0){
                arr[i-1] *= -1;
            }else{
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {2,3,1,2,3};
        System.out.println(duplicate(arr, N));
    }
}

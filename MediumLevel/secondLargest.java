package MediumLevel;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,45,2,4,5,12,58,41,2,55};
        int ans = secondMaxElement(arr,arr.length);
        System.out.println(ans);
    }
    public static int secondMaxElement(int[] arr ,int n){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        boolean allEqaul = true;

        for(int i=0; i<n; i++){
            if(arr[i] != arr[0]){
                allEqaul = false;
                break;
            }
        }
        if(allEqaul){
            return -1;
        }

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}

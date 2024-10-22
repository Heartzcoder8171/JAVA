import java.util.*;
public class max {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
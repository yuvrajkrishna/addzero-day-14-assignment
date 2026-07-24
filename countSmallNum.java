import java.util.Arrays;

public class countSmallNum {
    public static void main(String[] args) {
        int arr[] = {20,8,9,5,13};
        int countarr[] = new int [arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
            countarr[i] = count;
        }
        System.out.println(Arrays.toString(countarr));
    }
}

import java.util.Arrays;

public class alternativeArray {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        int m = arr.length;
        int arr2 [] = {60,70,80,90,100};
        int n = arr2.length;
        int arr3 [] = new int [m+n];
        int j = 0 ;
        int min = Math.min(m,n);
        for(int i = 0 ; i <min ; i++){
            arr3[j++] = arr[i];
            
            arr3[j++] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}

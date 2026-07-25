import java.util.Arrays;

public class arrwithtwotimes {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int arr2[] = new int [arr.length*2];
        int i = 0 ;
        int j = arr.length;
        while(i < arr.length){
            arr2[i] = arr[i];
            
            arr2[j] = arr[i];
            j++;
            i++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

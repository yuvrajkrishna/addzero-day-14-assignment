import java.util.Arrays;

public class arraywithtwoTimes {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int arr2[] = new int [arr.length*2];
        int i = 0 ;
        int j = 0;
        while(i < arr.length){
            arr2[j] = arr[i];
            j++;
            arr2[j] = arr[i];
            j++;
            i++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

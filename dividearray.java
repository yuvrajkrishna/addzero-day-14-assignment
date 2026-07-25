import java.util.Arrays;

public class dividearray {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50,60};
        int one [] = new int [arr.length/2];
        int two [] = new int [arr.length/2];
        int j = 0;
        int k = 0;
        int i = 0;
        while( i < arr.length){
            one[k++] = arr[i++];    
            two[j++] = arr[i++];
            
        }
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
    }
}

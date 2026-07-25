import java.util.Arrays;

public class dividearray {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50,60};
        int one [] = new int [arr.length/2];
        int two [] = new int [arr.length/2];
        int i = 0 ; 
        int k = arr.length/2;
        while(i < arr.length/2){
            one[i] = arr[i];
            two[i++] = arr[k++];
        }
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
    }
}

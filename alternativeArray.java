import java.util.Arrays;

public class alternativeArray {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        int arr2[] = {60,70};

        int[] arr3 = new int[arr.length + arr2.length];

        int i = 0, j = 0;

        while (i < arr.length && i < arr2.length) {
            arr3[j++] = arr[i];
            arr3[j++] = arr2[i];
            i++;
        }

        while (i < arr.length) {
            arr3[j++] = arr[i++];
        }

        while (i < arr2.length) {
            arr3[j++] = arr2[i++];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
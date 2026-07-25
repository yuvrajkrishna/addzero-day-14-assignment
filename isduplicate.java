public class isduplicate {
    public static void main(String[] args) {

        int arr[] = {1,2,3,2,5,6,7,2,3,3};

        for (int i = 0; i < arr.length; i++) {

            // Check if arr[i] already appeared before
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            // Check for duplicate after i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is duplicate");
                    break;   // Print only once
                }
            }
        }
    }
}
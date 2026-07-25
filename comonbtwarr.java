public class comonbtwarr {
    public static void main(String[] args) {
        int arr []= {1,6,3,4,5};
        int arr2 [] = {6,7,8,4,9};
        if(arr.length <= arr2.length){
            for(int i = 0 ; i < arr.length; i++){
                for(int j = 0 ; j < arr2.length;j++){
                    if(arr[i] == arr2[j]){
                        System.out.println(arr[i]);
                    }
                }
            }
        }
        else{
            for(int i = 0 ; i < arr2.length; i++){
                for(int j = 0 ; j < arr.length;j++){
                    if(arr2[i] == arr[j]){
                        System.out.println(arr2[i]);
                    }
                }
            }
        }
        }
    }


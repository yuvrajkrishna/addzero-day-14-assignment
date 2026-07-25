public class isunique {
    public static void main(String[] args) {
        int arr [] = {1,2,3,2,1};  
        for(int i = 0 ; i < arr.length ; i++){
            boolean isvisited = false;
            boolean isunique = true;
            for(int k = 0 ; k < i; k++){
                if(arr[k] == arr[i]){
                    isvisited = true;
                    break;
                }
            }

            if(isvisited == false){
                for(int j = i+1 ; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        isunique = false;
                        break;
                    }
                }
                if(isunique){
                    System.out.println(arr[i]);
                }
            }
        } 
        }
}



package Array_Problems;

public class printMissingNum {
    
    public static int[] printMissingNum (int arr []){

        int missingNumber[] = new int[arr.length];

        for(int i=0; i < arr.length ; i++){
            
            if(arr[i] != i+1){
                missingNumber[i] = i+1;
            }
        }

        return missingNumber;
    }

    public static void main(String[] args) {
        
        int arr[] = {1 ,3, 4, 6, 7 ,8 ,9 ,11};

        
        
    }
}

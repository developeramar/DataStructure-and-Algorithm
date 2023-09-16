package Array_Problems;


/*
 * 
 * Question -- Find duplicates in Array ...
 * 
 * 
 */
public class Find_duplicates {
    
    static boolean duplicates(int arr[] , int len){

        for(int i = 0 ; i<len-1 ; i++){
            for(int j=i+1 ; j<len ; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }

        return false;

    }


    public static void main(String[] args) {
        

        int arr [] = {10 ,5 , 6  ,1 , 2 , 3 };

        int size = arr.length-1;

        if(duplicates(arr, size)){
            System.out.println("Yess Duplicates are availabe");
        }

        else {
            System.out.println("Duplicates are not available");
        }

    }


}

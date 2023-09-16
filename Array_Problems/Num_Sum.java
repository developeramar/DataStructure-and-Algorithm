package Array_Problems;


/* 
 * 
 * Check if pair with given Sum exists in Array (Two Sum)
 */

public class Num_Sum {

      
     
     
    static boolean arrCal(int arr[] , int len , int x){

        for(int i = 0; i<len-1 ; i++){
            for(int j = i+1 ; j< len ; j++){

                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false ;

    }




/* 
    static boolean arrCal(int arr [] , int size , int x){

        for(int i = 0 ; i<size-1 ; i++){
            for(int j = i+1 ; j < size ; j++){
                
                if(arr[i] + arr[j] == x){
                    return true ;
                }
            }
        }

        return false;

    }

    */

    public static void main(String[] args) {
        
        int arr [] = {5 ,3 , 8 , 9 , 6 , 1 ,2};
        int size = arr.length-1;
        int x = 5;

        if(arrCal(arr, size, x)){
            System.out.println("Yess number is Available");
        }

        else{
            System.out.println("Number of pair not available");
        }

    }
    
}

package Array_Problems;

/*
 * 
 * 
 *    Question   --   Search Key in a Rotated Array
 */

public class SearchElement {

    static boolean search (int arr[] , int key){

        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] == key ){
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        
        int arr[] = {10 , 5, 6, 3, 8, 9 ,22 ,150};
        int key = 22;

        if(search(arr, key)){
            System.out.println("Element is present in this Array");
        }

        else{
            System.out.println("Element not present ");
        }
        
    }
    
}

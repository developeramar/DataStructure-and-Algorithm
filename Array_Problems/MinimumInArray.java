package Array_Problems;

/*
 * 
 * Question -- Minimum element in a sorted and rotated array
 * 
 */

public class MinimumInArray {
    
    public static void main(String[] args) {
        
        int arr[] = { 10, 5, 3, 8, 2, 4 };

        int min = arr[0];

        for(int i=0 ; i< arr.length ; i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum Element is -- " + min);

    }
}

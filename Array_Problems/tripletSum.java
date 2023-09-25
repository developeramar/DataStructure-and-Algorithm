
// write a program to find find tiplet(triple number in arry) number which sum is equal to given input

package Array_Problems;

import java.util.Arrays;


public class tripletSum {

    public static void tripletSum(int arr[] , int sum){

        System.out.println("Input Array : " + Arrays.toString(arr));   
        System.out.println("Given Number : " + sum);
        System.out.println("Array triplets whose sum is "+ sum +" are :");
         
        

         for(int i = 0 ; i < arr.length - 2  ; i++){
            for(int j = i+1 ; j < arr.length - 1  ; j++){
                for(int k = j+1 ; k < arr.length ; k++){

                    if(arr[i] + arr[j] + arr[k] == sum ){
                        System.out.println(" [" + arr[i] + "," + arr[j] + " ," + arr[k] + "]");
                    }
                }
            }
         }

        
    
    }
    

    public static void main(String[] args) {

        int arr[] = {10,15,5,3,8,91,20,0};
        int sum = 25;

        tripletSum(arr, sum);
        
    }
}

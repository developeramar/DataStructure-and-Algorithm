package Array_Problems;

import java.util.Arrays;

// -- write a program to find sum of two number is equal to third  --

public class sumoftwoeqlthird {

    public static void tripleNum(int arr[]){

        System.out.println("Given Array is " + Arrays.toString(arr));

         System.out.println("Result will be -- ");
        for(int i = 0 ; i < arr.length - 2 ; i++){
            for(int j = i+1 ; j < arr.length - 1 ; j++){
                for(int k = j+ 1 ; k < arr.length ; k++){

                   

                    if(arr[i] + arr[j] == arr[k]){
                        System.out.println("[ " + arr[i] + " + " + arr[j] + "=" +arr[k] + "]");
                    }
                    else if (arr[j] + arr[k] == arr[k]){
                         System.out.println("[ " + arr[j] + " + " + arr[k] + "=" +arr[i] + "]");
                    }
                    else if(arr[i] + arr[k] == arr[j]){
                         System.out.println("[ " + arr[i] + " + " + arr[k] + "=" +arr[j] + "]");
                    }
                }
            }
        }

          
    }

    public static void main(String[] args) {
        
        int arr[] = {20,40,10,30,50,70,80,90 , -20 , -30};

        // int res = Arrays.binarySearch(arr, 90);  // for searching the element using predefine class ;

        //System.out.println(res);


        tripleNum(arr);
    }
    
}

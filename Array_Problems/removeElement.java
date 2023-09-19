package Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

//  Remove element from a given array...

public class removeElement {

    public static int [] remove(int arr[] , int key){

        int index =0;
        int array[] =new int[arr.length-1];

        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] != key ){
                array[index] = arr[i];
                index++;
            }
        }
        return array;
    }

    public static void main(String[] args) {

    

        int originalArray[] = {1,2,3,4,5,6,7,8,9,10};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter remove key or element --");
        int key ;
        key = sc.nextInt();

        
        int array [] = remove(originalArray, key);

        System.out.println("Original Array " + Arrays.toString(originalArray)) ;
        System.out.println("New Array " + Arrays.toString(array));


    }
    
}

package Array_Problems;

/*
 * 
 * Question -- Java program to find maximum product subarray.
 * 
 */

public class MaxProductSubarray {

    public static void main(String[] args) {

        int arr[] = { 10, 5, 3, 8, 2, 1, 4 };

        int Minvalue = 1;
        int MaxValue = 1;

        for (int i = 0; i < arr.length; i++) {
           
            MaxValue = MaxValue * arr[i];

            if (Minvalue < MaxValue) {
                Minvalue = MaxValue;
            }

            if (MaxValue < 0) {
                MaxValue = 1;
            }

        }

        System.out.println("Max Product is -- " + MaxValue);

    }

}

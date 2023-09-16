package Array_Problems;

/*
 * 
 * Question -- Find the Product of Array ---
 * 
 */

public class Product_of_Array {

    public static void product(int arr[], int product[], int len) {

        int prefix[] = new int[len];
        prefix[0] = 1;

        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        int suffix = 1;

        for (int i = len - 1; i >= 0; i--) {
            product[i] = suffix * prefix[i];
            suffix = suffix * arr[i];
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {1 , 4 , 6 , 2 , 3};

        int len = arr.length;
        int product[] = new int[len];

        product(arr, product, len);

        System.out.print("The product of array Except itself is: ");
        for(int i=0;i<len;i++)
        {
            System.out.print(product[i]+", "); 
        }
        System.out.println();
    }

}

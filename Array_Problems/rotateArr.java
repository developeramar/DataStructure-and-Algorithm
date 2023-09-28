package Array_Problems;

// Rotate the array  to the last position

public class rotateArr {

    public static void rotate(int arr[]){

        int lastlen = arr[arr.length - 1];

        for(int i = arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0]  = lastlen;
    }
   
    
    public static void main(String[] args) {
        
        int arr[] ={2,1,5,6,8,9,10,11,12,13,14,15,16};
        int n = arr.length;

        System.out.println("before rotate array - ");

        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("After rotate array");
        rotate(arr);
        
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        
       

    }
}

package DSA.Sorting;

public class selectionSort {

    public static void selectionSort(int arr[]){

        for(int i=0; i<arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = {5,2,4,6,1,8,7,3,9};

        // Selection Sort  in java


        for(int i=0; i<arr.length-1 ;i++){
            int smallest = i;

            for(int j=i+1 ; j<arr.length  ; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        selectionSort(arr);
    }
}

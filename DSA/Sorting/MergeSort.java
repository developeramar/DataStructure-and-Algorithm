package DSA.Sorting;

public class MergeSort {
    public static void concqure(int arr[], int si, int mid, int ei) {

        int merged [] = new int[ei - si +1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x =0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++ ; idx1++;

            }
            else{
                merged[x] = arr[idx2];
                x++ ; idx2++;
            }
        }
        while(idx1 <= mid){
             merged[x] = arr[idx1];
                x++ ; idx1++;
        }

        while(idx2 <= ei){
            merged[x] = arr[idx2];
                x++ ; idx2++;
        }

        for(int i=0 , j=si; i<merged.length ; i++ , j++ ){
            arr[j] = merged[i];
        }


    }
    

    static void divde(int arr[] , int si , int ei){

        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        divde(arr, si, mid);
        divde(arr, mid+1, ei);
        concqure(arr , si ,mid, ei);
    }

    public static void main(String[] args) {

        int arr [] ={8,2,4,6,3,5,9,7,1};
        int len = arr.length;

        divde(arr, 0, len-1);
        System.out.println();
        for(int i=0 ; i<len ; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
        
    }

    
}

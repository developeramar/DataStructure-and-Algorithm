package DSA.Sorting;

public class mergePractice {

    static void concquer(int arr[] , int si , int ei , int mid){

        int merged [] = new int[ei-si + 1];

        int idx1 = si;
        int idx2 =mid+1;
        int k =0;

        while(idx1 <= mid && idx2 <= ei){

            if(arr[idx1] <= arr[idx2]){
                arr[k] = arr[idx1];
                k++; idx1++;
            }
        }

        while(idx1 <= mid){
            arr[k] = arr[idx1];
            k++; idx1++;
        }
        while(idx2 <=ei){
            arr[k] = arr[idx2];
            k++; idx2++;
        }
        for(int i=0 , j=si; i<merged.length ; i++ , j++ ){
            arr[j] = merged[i];
        }
    }
    
    static void divide(int arr[] , int si, int ei){

        if(si >= ei){
            return;
        }

        int mid = si + (ei -si)/2;

        divide(arr, si, ei);
        divide(arr, mid+1, ei);
        concquer(arr , si,mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {7,5,9,2,4,6};

       
        int len = arr.length;

        divide(arr, 0, len-1);
        System.out.println();
        for(int i=0 ; i<len ; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }
}

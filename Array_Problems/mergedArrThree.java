package Array_Problems;

public class mergedArrThree {

    public static int[] mergedArr(int arr0[] , int arr1[]){
        int len = arr0.length;
        int len2 = arr1.length;
        int mergedbothArr[] = new int[len + len2];

        int i=0, j=0, k=0;

        while(i < len && j < len2){
            if(arr0[i]  < arr1[j]){
                mergedbothArr[k] = arr0[i];
                k++ ; i++;
            }
            else{
                mergedbothArr[k] = arr1[j];
                k++ ; j++;
            }
        }

        while(i < len){
            mergedbothArr[k] = arr0[i];
                k++ ; i++;
        }
        while(j < len2){
             mergedbothArr [k] = arr1[j];
                k++ ; j++;
        }

        return mergedbothArr;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {5,3,10,52,1};
        int arr2[] = {67 , 55 , 9, 33};

        int nerarr[] = mergedArr(arr, arr2);

        for(int i= 0 ; i<arr.length + arr2.length ; i++){
            System.out.print(" " + nerarr[i]);
        }
    }
}

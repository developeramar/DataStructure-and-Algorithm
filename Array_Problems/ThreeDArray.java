package Array_Problems;

// 3d array problem

public class ThreeDArray {

    public static void main(String[] args) {
        int [] [][] test = {
            {
                {1, 2, 3}
               
            },
            {
                {4, 5, 6},
                {7, 8, 9}

            }
    
        };

        // using for loop to generate the array

        for (int i = 0 ; i < test.length ; i++){
            for(int j =0 ; j < test[i].length ; j++){
                for(int k = 0 ;  k < test[i][j].length ; k++){
                    System.out.print(test[i][j][k] + " ");
                }
            }
        }

        // using for each loop to continue to generate the array

        System.out.println();
        for(int [][] arr1 : test){
            for(int arr2[] : arr1){
                for(int arr3 : arr2){
                    System.out.print(arr3 + " ");
                }
            }
        }
    }
    
}

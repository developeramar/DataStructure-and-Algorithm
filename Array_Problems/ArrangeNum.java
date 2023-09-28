package Array_Problems;

public class ArrangeNum {

    public static void arrange(int arr[]) {

        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                if(i !=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int n [] = {1, -1, -2,2, -3,5, -4, -5,4,3};   
        
        System.out.println("Arraye without arranged elements");

    for(int i = 0; i < n.length; i++){
        System.out.print(n[i] + " ");
    }

    System.out.println();

    arrange(n);
    System.out.println("Arraye with arranged elements");
    
    for(int i = 0; i < n.length; i++) {
        System.out.print(n[i] + " ");
    }

}
}

package Strings_Problems;

public class reverseStrRecursion {
    
    static void reverseStrRecursion(String str){

        if(str == null || str.length() <= 1){
            System.out.println(str);
        }

        else {
            System.out.print(" "+ str.charAt(str.length()-1)+" ");

            reverseStrRecursion(str.substring(0, str.length()-1));
        }



    }

    public static void main(String[] args) {
        
        String str = "ABCDEFGH";

        reverseStrRecursion(str);

    }
}

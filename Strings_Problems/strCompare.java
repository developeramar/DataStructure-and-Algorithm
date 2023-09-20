package Strings_Problems;

//String Comparison without using any predefine Method --

public class strCompare {

    static boolean isCompare(String str1 , String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i=0 ; i<str1.length() -1 ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        
        String str1 = "Amar";
        String str2 = "amar";

        if(isCompare(str1, str2)){
            System.out.println("<--> Given Character is same <-->");
        }
        else{
            System.out.println("<--> Given Character is not same <-->");
        }
    }
    
}

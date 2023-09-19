package Strings_Problems;

// Check given String is  Panagram or not

public class Panagram {

    static  boolean isPanagram(String s){

        if(s.length() < 26){
            return false;
        }
        else{
            for(char ch = 'a' ; ch<='z' ; ch++){
                if(s.indexOf(0) <0){
                        return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        
        if(isPanagram(str.toLowerCase())){
            System.out.println("This is panagram");
        }
        else{
            System.out.println("Its not panagram");
        }
    }
    
}

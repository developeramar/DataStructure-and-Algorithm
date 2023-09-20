package Strings_Problems;

 
// input - a1b2c3 or a2b3c1 ____________~~~~~~~~~~~~____________~~~~~~~~~~~~____________~~~~~~~~~~~~.<.>..
//output - abbccc or aabbbc ____________~~~~~~~~~~~~____________~~~~~~~~~~~~____________~~~~~~~~~~~~.<.>..


public class ValuableProblems {

    public static void main(String[] args) {
        
        String str = "b5c8d9";

        for(int i=0; i<str.length() ; i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }

            else{
                int x = Character.getNumericValue(str.charAt(i));

                for(int j=1 ; j<x ; j++){
                    System.out.print(str.charAt(i-1));
                } 
            }
        }
    }
    
}

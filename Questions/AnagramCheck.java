package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a , String b){

        a= a.toLowerCase();
        b= b.toLowerCase();

        boolean res = false;

        if(a.length() == b.length()){

            char a1[] = a.toCharArray();
            char b1[] = b.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(b1);

            boolean result = Arrays.equals(a1 , b1);

            if(result){
                return true;
            }
            else {
                return false;
            }
        }

        else{
            System.out.println("Length is not match or not Anagram");
        }

        return res;

        
    }
    

    public static void main(String[] args) {
        
        String s1 , s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String --");
        s1 = sc.nextLine();

        System.out.println("Enter Sec String --");
        s2 = sc.nextLine();

        if(isAnagram(s1, s2)){
            System.out.println("Given String is Anagram");
        }

        else{
            System.out.println("Not Anagram");
        }

        
    }
}

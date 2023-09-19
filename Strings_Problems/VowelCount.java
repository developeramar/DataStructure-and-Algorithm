package Strings_Problems;

import java.util.Scanner;

// Vowel Count and Consonent Count in java


public class VowelCount {

    public static void main(String[] args) {
        int vowel =0 , cons =0;
        String str = "AmarPatelBelhari";
        str = str.toLowerCase();
        char ch[] = str.toCharArray();

        for(int i=0 ; i< ch.length ; i++){
            
            if(ch[i] =='a' || ch[i] =='e' || ch[i] == 'i' || ch[i] =='o' || ch[i] =='u'){
                vowel++;
            }
            else{
                cons++;
            }
        }

        System.out.println("Vowel is in given String is --" + vowel);
        System.out.println("Cons is in given String is --" + cons);

       
    }

    
    
}

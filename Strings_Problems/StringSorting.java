package Strings_Problems;

import java.util.Arrays;

public class StringSorting {

    public static void main(String[] args) {
        String str = "zyxbcda";

    char newArr[] = str.toCharArray();

     Arrays.sort(newArr);

     String ss = new String(newArr);
     System.out.println("new Sorted String is --" + ss);
    }
    
}
